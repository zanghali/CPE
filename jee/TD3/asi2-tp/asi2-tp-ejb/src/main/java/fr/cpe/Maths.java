package fr.cpe;

import fr.cpe.impl.IMaths;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class Maths implements IMaths{
	
	@Override
	public double add (List<Double> n) {
		return n.stream().mapToDouble(Double::doubleValue).sum();
	}

}
