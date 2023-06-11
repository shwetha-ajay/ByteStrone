import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './Authguard/auth.guard';

const routes: Routes = [
  {path:"",redirectTo: "login",pathMatch:"full"},
  {path:"dashboard",component:AdminDashboardComponent,canActivate: [AuthGuard],data: { expectedRole: 'superadmin' }},
  {path:"login",component:LoginComponent},
  {path:"Admin",component:AdminComponent},

  {path:"user",component:UserComponent,canActivate: [AuthGuard],data: { expectedRole: 'User' }},
  {path:"home",component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
