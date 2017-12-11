package com.dbs.restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/ApplicationRestService")

public class ApplicationRestService {
	@GET
	@Path("/users/{input}")
	@Produces("text/plain")
	public Response postInput(@PathParam("input")int input) {
		return Response.status(200)
				.entity("getUserByName is called, name : ").build();
	}
}
