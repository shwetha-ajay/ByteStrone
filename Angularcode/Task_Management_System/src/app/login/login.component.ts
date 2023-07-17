import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login';
import { LoginServiceService } from '../services/login-service.service';
import { Router } from '@angular/router';
import { FormBuilder,FormControl,FormGroup,Validators } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
}) 
export class LoginComponent  { 
 
  email!:string;
  password!:string;
  role!:string;
  logindetails= new Login();
  response:any;
  loginForm=new FormGroup({
    email:new FormControl('',[Validators.required,Validators.email]),
    password:new FormControl('',[Validators.required,Validators.minLength(6)]),
    role:new FormControl('',[Validators.required])
  })

constructor( private loginservice: LoginServiceService,private router:Router) { 
}

  // Function to handle login
doLogin(){

    this.logindetails.email=this.email
    this.logindetails.password=this.password
    this.logindetails.roleName=this.role
    // console.log(this.logindetails)
    this.loginservice.login(this.loginForm.value).subscribe(res=>{
      this.response=res;
      console.log(this.response);
      // console.log(this.response.role)
      this.loginservice.setEmail(this.response.email)
      console.log(this.response.email);
      this.loginservice.setRole(this.response.roleName)
      if(this.response.roleName=="superadmin"){
        this.router.navigate(["/dashboard"])
      }
      if(this.response.roleName=="Admin"){
        this.router.navigate(["/user"])        
      }
      if(this.response.roleName=="User"){
        this.router.navigate(["/user"])
      }
    },
    (error)=>{
      alert('Invalid login details');
    });

   
  }
}


  



