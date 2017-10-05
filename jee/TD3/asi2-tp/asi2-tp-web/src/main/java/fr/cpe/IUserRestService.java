package fr.cpe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import fr.cpe.model.User;

@Path("/users")
public interface IUserRestService {
	
	@GET
	@Path("/")
//	void saveUser (@QueryParam("login") String login, @QueryParam("password") String password);
	void saveUser (User user);

}
