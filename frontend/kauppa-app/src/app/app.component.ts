import { Component } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello World';
  private apiUrl = 'http://localhost:8080/persons';
  data: any = {};

  constructor(private http: Http){
    console.log("hello");
    this.getPersons();
    this.getData();
  }

  getData(){
    return this.http.get(this.apiUrl).map((res : Response) => res.json())
  }

  getPersons() {
    this.getData().subscribe(data =>  {
      console.log(data);
      this.data = data
    })
  }
}
