package com.myCompany.karafExamples.club.service;

import java.util.ArrayList;
import java.util.List;
import com.myCompany.karafExamples.api.ClubService;
import com.myCompany.karafExamples.api.PlayerService;
import com.myCompany.karafExamples.api.model.Player;
import com.myCompany.karafExamples.api.model.Club;


public class ClubServiceImpl implements ClubService {

	private PlayerService playerService;

	private List<Club> clubs;

	public ClubServiceImpl() {
		clubs = new ArrayList<>();
		clubs.add(new Club(1, "Barcelona"));
		clubs.add(new Club(2, "Milan"));

	}

	@Override
	public Club findById(Integer id) {
		Club c = clubs.stream().filter(a -> a.getId().equals(id)).findFirst().get();
		c.setPlayers(playerService.findAllByClubId(id));
		return c;
	}

	@Override
	public List<Club> findAll() {
		return clubs;
	}

	@Override
	public Club add(Club club) {
		clubs.add(club);
		club.setId(clubs.size());
		return club;
	}

	public PlayerService getPlayerService() {
		return playerService;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}



}
