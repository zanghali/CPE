package fr.cpe.jms.producer;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Stateless
public class HelloJmsProducer implements IHelloJmsProducer {

	@Resource(name="java:/asi2-tp-hello")
	private Queue queue;
	
	@Inject
	private JMSContext context;
	
	@Override
	public void sayHello(String name) {
		context.createProducer()
		.send(queue, name);
	}
}
