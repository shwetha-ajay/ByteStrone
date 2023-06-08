import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../services/login-service.service';
import { Login } from '../models/login';
import { HttpClient } from '@angular/common/http';
import { Task } from '../class/task';
import { compileNgModule } from '@angular/compiler';
import { Location } from '@angular/common';
import { Router } from '@angular/router';



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
    
    
    
    constructor(private loginService: LoginServiceService,private router: Router) { }
  
    ngOnInit(): void {
       this.getTasks();
    }


    // onDelete(taskID:number){
    //   console.log("object");
    //   console.log(taskID);


    //   this.loginService.deleteTask(taskID).subscribe((res)=>{
    //     console.log(res);
    //     this.getTasks()
    //     // console.log(Task);
    //   //  this.ngOnInit()
        
       
    // })
    // }
    onDelete(taskID: number) { this.loginService.deleteTask(taskID).subscribe((res) =>

      { // Remove the deleted task from the tasks array 
     
    //  this.tasks = this.tasks.filter((task: Task) => task.taskID !== taskID);
    // this.getTasks();
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
  
    // updateStatus(taskId: number): void {
    //   this.loginService.updateStatus(taskId).subscribe(updatedTask => {
    //     const index = this.tasks.findIndex((task: { id: any; }) => task.id === updatedTask.id);
    //     if (index !== -1) {
    //       this.tasks[index] = updatedTask;
    //     }
    //   });

      
    // updateStatus(taskID:number){
    //   console.log(taskID);
    //   this.loginService.updateStatus(taskID).subscribe((res)=>{
    //     console.log(res);
    //     this.getTasks()
    //     console.log(Task);
    //    this.ngOnInit()  
    // })
    // }
    updateStatus(taskId: number,status:string): void {
      // Make the API call to update the task status
      this.loginService.updateStatus(taskId,status).subscribe(
        () => {
          console.log('Task status updated successfully.');
          // Perform any additional actions or updates after successful status update
        },
        (error: any) => {
          console.error('Error updating task status:', error);
          // Handle error scenario, show error message, etc.
        }
      );
    }

    filter(){
      this.tasks.sort((a: { priority: number; }, b: { priority: number; }) => a.priority - b.priority);
      console.log(this.tasks);

    }
  }
