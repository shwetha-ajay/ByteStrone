import { Component } from '@angular/core';
import { Login } from '../models/login';
import { LoginServiceService } from '../services/login-service.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent { 
  email!:string;
  password!:string;
  role!:string;
  logindetails= new Login();
  response:any;

constructor( private loginservice: LoginServiceService,private router:Router) {}

  // Function to handle login
doLogin(){

    this.logindetails.email=this.email
    this.logindetails.password=this.password
    this.logindetails.roleName=this.role
    console.log(this.logindetails)
    this.loginservice.login(this.logindetails).subscribe(res=>{
      this.response=res;
      console.log(this.response.role)
      this.loginservice.setEmail(this.email)
      if(this.response.roleName=="superadmin"){
        this.router.navigate(["/dashboard"])
      }
      if(this.response.roleName=="Admin"){
        this.router.navigate(["/user"])
      }
      if(this.response.roleName=="User"){
        this.router.navigate(["/user"])
      }
    })

    // console.log(this.email,this.password,this.role);
   
  }
}


  



