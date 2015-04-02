package com.example.rest.jersey;

import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author Maulik
 * 
 */
public class JerseyClientPostDemo {
	private static final Logger logger = Logger
			.getLogger(JerseyClientPostDemo.class);

	public static void main(String[] args) {
		try {
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:9191/JavaWebAppDemo/rest/jsonJerseyDemo/postStudentInfo");

			String input = "{\"id\":\"stu001\",\"firstName\":\"Maulik\",\"lastName\":\"Patel\",\"age\":15,\"gender\":\"Male\",\"address\":\"Ranip\"}";
			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			logger.info("Output from Server .... \n");
			String output = response.getEntity(String.class);
			logger.info(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
