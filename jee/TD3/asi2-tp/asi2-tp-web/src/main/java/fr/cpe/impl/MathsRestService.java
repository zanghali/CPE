package fr.cpe.impl;

import fr.cpe.IMathsRestService;
import fr.cpe.impl.IMaths;

import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.QueryParam;
import javax.inject.Inject;

public class MathsRestService implements IMathsRestService {
	
	Logger logger = Logger.getLogger(MathsRestService.class.getName());

	@Inject
	IMaths mathsService;

	public Double add(@QueryParam("n") List<Double> n) {
		
		logger.info(">>> add(" + n + ")");
		
		return mathsService.add(n);
	}
}
