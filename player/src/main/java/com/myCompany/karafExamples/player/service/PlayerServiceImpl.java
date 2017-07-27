package com.myCompany.karafExamples.player.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myCompany.karafExamples.api.PlayerService;
import com.myCompany.karafExamples.api.model.Player;


public class PlayerServiceImpl implements PlayerService {

	private List<Player> players;
	
	public PlayerServiceImpl() {
		players = new ArrayList<>(); 
		players.add(new Player(10, "Leo Messi",  1));
		players.add(new Player(3, "Paolo Maldini",  2));
		players.add(new Player(9, "Johan Cruyff",  1));
	}
	
	public Player findById(Integer id) {
		return players.stream().filter(a -> a.getId().equals(id)).findFirst().get();
	}

	public List<Player> findAll() {
		return players;
	}
	
	public Player add(Player account) {
		players.add(account);
		account.setId(players.size());
		return account;
	}

	@Override
	public List<Player> findAllByClubId(Integer clubId) {
		return players.stream().filter(a -> a.getClubId().equals(clubId)).collect(Collectors.toList());
	}
	
}
