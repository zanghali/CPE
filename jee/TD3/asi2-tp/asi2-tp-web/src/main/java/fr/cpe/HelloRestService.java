package fr.cpe;

import javax.inject.Inject;
import java.util.logging.Logger;

import fr.cpe.impl.IHello;
import fr.cpe.impl.IHelloRestService;


public class HelloRestService implements IHelloRestService {
	
	Logger logger = Logger.getLogger(HelloRestService.class.getName());

	@Inject
	IHello helloService;
	
	public String hello() {
		logger.info(">>> hello()");
		
		return helloService.sayHello();
	}

}
