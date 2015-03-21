package com.example.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author Maulik
 * 
 */
@Path("/jerseyPathParameter")
public class PathParameterJerseyDemo {

	@GET
	@Path("singlePathParameter/{param}")
	public Response getMsg1(@PathParam("param") String msg) {
		String output = "Jersey SinglePath Parameter : " + msg;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/multiPathParameter/{firstName}/{lastName}")
	public Response getMultiPathParameter(
			@PathParam("firstName") String firstName,
			@PathParam("lastName") String lastName) {
		String output = "Jersey MultiPath Parameter : " + firstName +" "+ lastName;
		return Response.status(200).entity(output).build();
	}
}
