package com.example.rest.jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author Maulik
 * 
 */
public class JerseyClientGetDemo {

	public static void main(String[] args) {
		try {
			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:9191/JavaWebAppDemo/rest/jsonJerseyDemo/getStudentInfo");
			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
