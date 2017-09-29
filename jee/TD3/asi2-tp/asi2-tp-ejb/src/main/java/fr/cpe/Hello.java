package fr.cpe;

import javax.ejb.Stateless;

import fr.cpe.impl.IHello;

@Stateless
public class Hello implements IHello{
	
	public String sayHello (String name) {
		return "Hello " + ((name == null) ? "!!" : name) ;
	}

}
