package com.hexaware.challenge.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entity.Players;
import com.hexaware.challenge.service.IPlayersService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayersController {
	@Autowired
	IPlayersService service;
	
	@PostMapping("/add")
	public Players addPlayers(@Valid @RequestBody PlayersDTO playersDTO) {
		return service.addPlayers(playersDTO);
	}

	@GetMapping("/all")
	public List<Players> getAllPlayers() {
		return service.getAllPlayers();
	}
	
}
