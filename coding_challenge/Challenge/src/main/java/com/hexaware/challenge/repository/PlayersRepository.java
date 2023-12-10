package com.hexaware.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.challenge.entity.Players;

public interface PlayersRepository extends JpaRepository<Players, Integer>{
	@Query("FROM Players ORDER BY playerName ASC")
	List<Players> findPlayersByTotalMatchesOrderedByName();
}
