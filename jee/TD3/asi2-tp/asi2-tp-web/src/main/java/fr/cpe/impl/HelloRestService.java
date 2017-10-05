package fr.cpe.impl;

import javax.inject.Inject;
import javax.ws.rs.QueryParam;

import java.util.logging.Logger;

import fr.cpe.IHelloRestService;
import fr.cpe.impl.IHello;


public class HelloRestService implements IHelloRestService {
	
	Logger logger = Logger.getLogger(HelloRestService.class.getName());

	@Inject
	IHello helloService;

	public String hello(@QueryParam("name") String name) {
		logger.info(">>> hello(" + name + ")");
		
		return helloService.sayHello(name);
	}
}
