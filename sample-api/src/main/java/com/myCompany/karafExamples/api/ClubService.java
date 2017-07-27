package com.myCompany.karafExamples.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.myCompany.karafExamples.api.model.Club;

public interface ClubService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Club findById(@PathParam("id") Integer id);

	@GET
	@Path("/")
	@Produces("application/json")
	public List<Club> findAll();

	@POST
	@Path("/")
	@Consumes("application/json")
	@Produces("application/json")
	public Club add(Club club);
	
}
