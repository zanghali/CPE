package fr.cpe.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public interface IHelloRestService {
	@GET
	@Produces("text/plain")
	String hello();
}
