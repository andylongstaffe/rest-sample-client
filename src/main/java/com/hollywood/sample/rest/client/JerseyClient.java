package com.hollywood.sample.rest.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class JerseyClient {
	
	private WebResource service;
	
	public JerseyClient() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		service = client.resource(getBaseURI());
	}
	
	public WebResource getWebResource() {		
		return service;
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8090/rest-server-sample-jersey").build();
	}
	
	public String getUsers()
	{
		return service.path("rest").path("userservice").path("users").accept(MediaType.APPLICATION_JSON).get(String.class);
	}
}
