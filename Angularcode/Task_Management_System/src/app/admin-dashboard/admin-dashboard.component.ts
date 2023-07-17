import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login';
import { LoginServiceService } from '../services/login-service.service';
import { User } from '../class/user';
import { NgxPaginationModule } from 'ngx-pagination/public-api';
import { FormControl, FormGroup, Validators } from '@angular/forms';

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
  
  page:number=1
  count:number=0
  tableSize:number=5
  userForm=new FormGroup({
    email:new FormControl('', [Validators.required, Validators.email])
  })

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
 onTableDataChange(event:any){
  this.page=event;
  this.getUsers();
 }
//  onTableSizeChange(event:any):void{
//   this.tableSize=event.target.value
//   this.page=1;
//   this.getUsers()
//  }
 
 

  deleteUser(userID:number){
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
      this.getUsers()
    });
  }
}



  

