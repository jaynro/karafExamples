package com.myCompany.karafExamples.api.model;

public class Player {

	private Integer id;
	private String name;
	private Integer clubId;

	public Player() {

	}

	public Player(Integer id, String name,  Integer clubId) {
		this.id = id;
		this.name = name;
		this.clubId = clubId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	



}
