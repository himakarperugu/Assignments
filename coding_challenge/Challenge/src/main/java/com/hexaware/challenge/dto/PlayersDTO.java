package com.hexaware.challenge.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PlayersDTO {
	
	
	
	private int playerID;
	
	@NotBlank
	@Pattern(regexp = "[A-Za-z]{4,20}",message = "playerName minimum of size 2")
	private	String playerName;
	
	@Min(value = 1)
	@Max(value = 100)
	private int	jerseyNumber;
	
	private String role;
	
	@Min(value = 1,message = "totalMatches played should be greater than 1")
	private int totalMatches;
	
	@NotBlank
	private String teamName;
	
	@NotBlank
	private String stateName;
	
	@NotBlank(message = "write something about the player")
	private String description;
	
	public PlayersDTO() {
		super();
	}

	public PlayersDTO(int playerID, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String stateName, String description) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.stateName = stateName;
		this.description = description;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
