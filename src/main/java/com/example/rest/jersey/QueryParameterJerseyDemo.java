package com.example.rest.jersey;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@Path("/jerseyQueryParameter")
public class QueryParameterJerseyDemo {

	private static final Logger logger = Logger
			.getLogger(QueryParameterJerseyDemo.class);

	@GET
	@Path("singleQueryParameter")
	public Response getMsg1(@QueryParam("firstName") String firstName) {
		String output = "Jersey SingleQuery Parameter : " + firstName;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/multiQueryParameter")
	public Response getMultiPathParameter(
			@QueryParam("firstName") String firstName,
			@QueryParam("lastName") String lastName,
			@QueryParam("mobileNo") List<String> mobileNo) {
		String output = "Jersey MultiQuery Parameter : " + firstName + " "
				+ lastName + " " + mobileNo.toString();
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/dynamicQueryParameter")
	public Response getUsers(@Context UriInfo info) {
		logger.info(info.getPath());
		logger.info(info.getAbsolutePath());
		logger.info(info.getBaseUri());
		logger.info(info.getRequestUri());
		String firstName = info.getQueryParameters().getFirst("firstName");
		String lastName = info.getQueryParameters().getFirst("lastName");
		List<String> mobileNo = info.getQueryParameters().get("mobileNo");
		String output = "Jersey MultiQuery Parameter : " + firstName + " "
				+ lastName + " " + mobileNo.toString();
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/defualtQueryParameter")
	public Response getUsers(
			@DefaultValue("Path") @QueryParam("firstName") String firstName,
			@DefaultValue("Patel") @QueryParam("lastName") String lastName,
			@DefaultValue("110110110") @QueryParam("mobileNo") List<String> mobileNo) {
		String output = "Jersey MultiQuery Parameter : " + firstName + " "
				+ lastName + " " + mobileNo.toString();
		return Response.status(200).entity(output).build();
	}
}
