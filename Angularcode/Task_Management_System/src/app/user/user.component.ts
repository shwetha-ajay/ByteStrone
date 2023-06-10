import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../services/login-service.service';
import { Router } from 'express';
import { Task } from '../class/task';
import { User } from '../class/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent  {
  email!:String;
  users:any
  userID!:any
  tasks!:any
  loginService: any;

constructor(private service:LoginServiceService){}

ngOnInit(): void {
    this.email=this.service.getEmail()
    console.log(this.email)
     
    this.service.getuserId(this.email).subscribe((res)=>{
      this.userID=res
      console.log(res);
      this.service.userTasks(this.userID).subscribe((res)=>{
      this.users=res
      console.log(res);
    })
    }
    )   
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
}

