import { HttpClient, HttpHeaderResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Login } from '../models/login';
import { Task } from '../class/task';
import { Observable } from 'rxjs';
import { User } from '../class/user';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  email!:string;
  getEmail(){
    return this.email
  }
  setEmail(email:string){
    this.email=email;
  }

 url="http://localhost:8080/login"
 add="http://localhost:8080/user"
 apiUrl="http://localhost:8080/task"
 api="http://localhost:8080/viewTask"
 api2="http://localhost:8080/addAdmin"
 api3="http://localhost:8080/viewAdmin"
 deletetask="http://localhost:8080/deleteTask"
 userTaskDetails="http://localhost:8080/searchByuser"


  constructor(private http:HttpClient) {}
 
    public login(login:Login){
      return this.http.post(this.url,login)
    }

    public getuserId(email:String){
      return this.http.get(`http://localhost:8080/userid?email=${email}`)
    }

    public userTasks(userID:String){
      return this.http.get(`http://localhost:8080/searchByuser/${userID}`)
    }

    public addAdmin(user:Login){
      return this.http.post(this.url,user)
    }

    public addTask(task: Task): Observable<Task> {
      return this.http.post<Task>(`${this.apiUrl}`, task);
    }

    public getTasks(): Observable<Task[]> {
      return this.http.get<Task[]>(`${this.api}`);
    }

    public addUser(user: User): Observable<User> {
      return this.http.post<User>(`${this.api2}`, user);
    }

    public getUsers(): Observable<User[]> {
      return this.http.get<User[]>(`${this.api3}`);
    }

    public deleteTask(taskId:number) {
      console.log(taskId);
      return this.http.delete(`http://localhost:8080/deleteTask/${taskId}`);
    }

    public deleteUser(userId:number): Observable<any> {
      console.log(userId);
      return this.http.delete(`http://localhost:8080/deleteAdmin/${userId}`);
    }

    public updateStatus(taskId:number,status:string): Observable<any> {
      console.log(taskId);
      const statusUpdate={
        taskId:taskId,
        status:status
        }
        console.log(statusUpdate);
        return this.http.post("http://localhost:8080/updatestatus",statusUpdate);
      }
    
  }

