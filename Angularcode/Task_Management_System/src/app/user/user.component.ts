import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../services/login-service.service';

import { Task } from '../class/task';
import { User } from '../class/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user:any
  email!:String;
  users:any
  userID!:any
  tasks!:any
  admin=false

  //loginService: any;

constructor(private service:LoginServiceService,private router:Router){}

ngOnInit(): void {
    if(this.service.getRole()=="Admin"){
     // console.log("sss");
       this.admin=true
    }

    this.email=this.service.getEmail()
    console.log(this.email)
    
    this.service.getuserId(this.email).subscribe((res)=>{
      this.userID=res
      // console.log(res);
      this.service.userTasks(this.userID).subscribe((res)=>{
        // console.log("hello");
      this.users=res
      console.log(res);
    })
    }
    )   
 }


  updateStatus(taskId: number,status:string): void {
    this.service.updateStatus(taskId,status).subscribe(
      () => {
        console.log('Task status updated successfully.');
      },
      (error: any) => {
        console.error('Error updating task status:', error);
      }
    );
  }


}




