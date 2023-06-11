import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { LoginServiceService } from '../services/login-service.service';

 

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
 constructor(private loginService: LoginServiceService, private router: Router) {}
   
 

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    const roleName:any=this.loginService.getRole()
  //  return false
   

  

const expectedRole: any = route.data['expectedRole'];
    console.log(expectedRole);
    console.log(roleName);
  
      if (roleName ==='User' && expectedRole === 'User') {
        // User is authenticated and has the expected role, allow access to user dashboard
        return true;
      }
      
      if (roleName ==='Admin' && expectedRole === 'User') {
        // User is authenticated and has the expected role, allow access to user dashboard
        return true;
      
      }
   
    

      if (roleName === 'superadmin' && expectedRole === 'superadmin') {
        return true;
      }
    
     else { // User is not authenticated, redirect to login page 
      console.log("object");
      this.router.navigate(['/login']); 
      return false;
     }
    
  }
}

