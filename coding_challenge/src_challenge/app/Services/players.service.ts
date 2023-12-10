import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Players } from '../Model/Players';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayersService {

  constructor(private http:HttpClient) { }

  baseURL:string = 'http://localhost:8484/api/players/';

  insert(body:Players):Observable<Players>{

    console.log(body);

  return this.http.post<Players>(this.baseURL+"add",body);

  }
  getAll():Observable<Players[]>{

    console.log('In Get of players');

  return this.http.get<Players[]>(this.baseURL+"all");

  }
  
}
