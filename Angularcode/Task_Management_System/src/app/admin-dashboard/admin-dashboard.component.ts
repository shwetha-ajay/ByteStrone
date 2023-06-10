import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login';
import { LoginServiceService } from '../services/login-service.service';
import { User } from '../class/user';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
  
  users: User[] = [];
  newUser: User = new User();
  userID!:number;
  name!:string;
  email!:string;
  password!:string


  constructor(private loginService: LoginServiceService) { }
   

  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(): void {
    this.loginService.getUsers().subscribe((users: User[]) => {
      this.users = users;
      console.log(users);
    });
  }
   
  
  deleteUser(userID:number){
    console.log("object");
    console.log(userID);

    this.loginService.deleteUser(userID).subscribe((res)=>{
      console.log(res);    
      this.ngOnInit()        
    })
  }
  
  addUser(): void {
    this.newUser.userID=this.userID
    this.newUser.name=this.name
    this.newUser.email=this.email
    this.newUser.password=this.password
    
    console.log(this.newUser);
    this.loginService.addUser(this.newUser).subscribe((user: User) => {
      this.users.push(user);
      console.log(user);
      this.newUser = new User();
    });
  }

  
}



  

