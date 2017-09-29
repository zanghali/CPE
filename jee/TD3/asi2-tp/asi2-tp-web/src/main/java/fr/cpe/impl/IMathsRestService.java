package fr.cpe.impl;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/add")
public interface IMathsRestService {
	
	@GET
	@Produces("text/plain")
	Double add(@QueryParam("n") List<Double> n);
}
