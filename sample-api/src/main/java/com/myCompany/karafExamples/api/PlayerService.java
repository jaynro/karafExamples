package com.myCompany.karafExamples.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.myCompany.karafExamples.api.model.Player;

public interface PlayerService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Player findById(@PathParam("id") Integer id);

	@GET
	@Path("/")
	@Produces("application/json")
	public List<Player> findAll();

	@GET
	@Path("/player/{playerId}")
	@Produces("application/json")
	public List<Player> findAllByClubId(@PathParam("clubId") Integer clubId);
	
	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	public Player add(Player player);

}
