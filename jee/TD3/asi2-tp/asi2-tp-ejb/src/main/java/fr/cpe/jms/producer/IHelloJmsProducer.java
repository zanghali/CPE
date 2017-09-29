package fr.cpe.jms.producer;

import javax.ejb.Local;

@Local
public interface IHelloJmsProducer {
	public void sayHello (String name);
}
