package fr.cpe;

import javax.ejb.Stateless;

import fr.cpe.impl.IHello;

@Stateless
public class Hello implements IHello{
	public String sayHello () {
		return "Hello";
	}

}
