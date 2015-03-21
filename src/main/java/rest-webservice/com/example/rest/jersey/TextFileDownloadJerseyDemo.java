package com.example.rest.jersey;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author Maulik
 * 
 */
@Path("/textFileDownload")
public class TextFileDownloadJerseyDemo {

	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response getFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("MyText.txt").getFile());
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=\"MyText.txt\"");
		return response.build();

	}
}
