package com.example.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author Maulik
 * 
 */
@Path("/jerseyHelloWorld")
public class SimpleHelloWorld {

	@GET
	@Path("/{param}")
	public Response getMsg1(@PathParam("param") String msg) {
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();

	}
}
