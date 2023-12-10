import { Component, OnInit } from '@angular/core';
import { Players } from 'src/app/Model/Players';
import { PlayersService } from 'src/app/Services/players.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent implements OnInit{
response:any;
allPlayers: Players[] = [];
  constructor(private playerService: PlayersService) {}
  ngOnInit(){
   
  }


insert(data:Players){
    
  this.playerService.insert(data)
  .subscribe(
    (player)=>{console.log('Add Player is: '+player);},



    error=>{console.log('Error is: '+error);}
    );


}
getAll(){
  
  this.playerService.getAll().subscribe( 
  (list)=>{ this.allPlayers = list;
  console.log(list)});

}

}
