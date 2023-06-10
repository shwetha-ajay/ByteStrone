import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../services/login-service.service';
import { Login } from '../models/login';
import { HttpClient } from '@angular/common/http';
import { Task } from '../class/task';
import { compileNgModule } from '@angular/compiler';
import { Location } from '@angular/common';
import { Router } from '@angular/router';
import { Taskscores } from '../class/taskscores';



@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})

  export class AdminComponent implements OnInit {
    // tasks: Task[] = [];
    tasks:any
    newTask: Task = new Task();
    title!:string;
    status!:string;
    priority!:number;
    taskID!:number;
    description!:string;
    dueDate!:Date;
    userID!:number;
    // assignedTo!:number;
    workID!:number;
    scores: number[] = [];
     taskScores: Taskscores[] = [];


    
  constructor(private loginService: LoginServiceService,private router: Router) { }
  
  ngOnInit(): void {
      this.getTasks();
    }


  onDelete(taskID: number) { this.loginService.deleteTask(taskID).subscribe((res) =>
      { 
    console.log("delete");
    this.getTasks();
    });        
    }

  getTasks(): void {
      this.loginService.getTasks().subscribe((res) => {
        this.tasks = res;
        console.log(this.tasks);
      })
    }
  
  addTask(): void {
      console.log(this.userID);
      this.newTask.taskID=this.taskID
      this.newTask.title=this.title
      this.newTask.status=this.status
      this.newTask.priority=this.priority
      this.newTask.description=this.description
      this.newTask.dueDate=this.dueDate
      this.newTask.userID = { userID: this.userID }
      console.log(this.newTask.userID.userID);
      // this.newTask.workID=this.workID
      
      console.log(this.newTask);
      this.loginService.addTask(this.newTask).subscribe((task: Task) => {
        console.log("Hello");
        this.tasks.push(task);
        console.log(task);
        this.newTask = new Task();
        this.getTasks()
      });
    }

    tasksPriority(){

      
      for (let i = 0; i < this.tasks.length; i++) {
        console.log(this.tasks.length);
        let taskID = this.tasks[i].taskID;
        this.loginService.sort(taskID).subscribe((score)=>{
          console.log(score);
          let taskScore: Taskscores = {
            taskID: this.tasks[i].taskID,
            title: this.tasks[i].title,
            status: this.tasks[i].status,
            priority: this.tasks[i].priority,
            dueDate: this.tasks[i].dueDate,
            description: this.tasks[i].description,
            workID: this.tasks[i].workID,
            userID: this.tasks[i].userID,
            score: score
          };
          console.log(score);
          this.taskScores.push(taskScore);

          this.scores.push(score)

          
        
         
        })

      }
      console.log(this.taskScores);
      // console.log(this.scores);
      // this.taskScores.sort((a: { score: number; }, b: { score: number; }) => b.score - a.score);
      // console.log(this.taskScores);
      // if(this.taskScores[0].score>this.taskScores[1].score){
      //   console.log("hi");
      // }
      console.log(this.taskScores[3]); // Output: number

      
    }
  
  updateStatus(taskId: number,status:string): void {
      this.loginService.updateStatus(taskId,status).subscribe(
        () => {
          console.log('Task status updated successfully.');
        },
        (error: any) => {
          console.error('Error updating task status:', error);
        }
      );
    }

  filter(){
      this.tasks.sort((a: { priority: number; }, b: { priority: number; }) => a.priority - b.priority);
      console.log(this.tasks);
    }
  }
