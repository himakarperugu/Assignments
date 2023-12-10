package com.hexaware.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entity.Players;
import com.hexaware.challenge.repository.PlayersRepository;
@Service
public class PlayersServiceImp implements IPlayersService {
	@Autowired
	PlayersRepository repo;
	
	@Override
	public Players addPlayers(PlayersDTO playersDTO) {
		Players players =new Players();
		
		players.setPlayerName(playersDTO.getPlayerName());
		players.setJerseyNumber(playersDTO.getJerseyNumber());
		players.setRole(playersDTO.getRole());
		players.setTotalMatches(playersDTO.getTotalMatches());
		players.setTeamName(playersDTO.getTeamName());
		players.setStateName(playersDTO.getStateName());
		players.setDescription(playersDTO.getDescription());
		
		
		
		
		return repo.save(players);
	}

	@Override
	public List<Players> getAllPlayers() {
		return repo.findAll();
	}

	

}
