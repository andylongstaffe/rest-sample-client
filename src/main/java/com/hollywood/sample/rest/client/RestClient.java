package com.hollywood.sample.rest.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestClient {
	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Fluent interfaces
		System.out.println(service.path("rest").path("userservice")
				.path("users").accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class).toString());
		
		System.out.println(service.path("rest").path("userservice")
				.path("users").accept(MediaType.APPLICATION_JSON).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8090/rest-server-sample-jersey").build();
	}

}
