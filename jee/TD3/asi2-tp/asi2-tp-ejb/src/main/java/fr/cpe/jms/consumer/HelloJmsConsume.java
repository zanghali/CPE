package fr.cpe.jms.consumer;

import java.util.logging.Logger;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "HelloJmsMDB", activationConfig= {
		@ActivationConfigProperty(propetyName = "destinationType", peropertyValue="javax.jms.Queue"),
		@ActivationConfigProperty(propetyName = "destination", peropertyValue="asi2-tp-hello"),
		@ActivationConfigProperty(propetyName = "acknowledgeMode", peropertyValue="Autoacknowledge")		
})

public class HelloJmsConsume implements MessageListener {
	private static Logger logger = Logger.getLogger(HelloJmsConsume.class.getName());

	@Override
	public void onMessage(Message message) {
		logger.info(">>> OnMessage() " + message);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
		
			try {
				logger.info(">>> Hello " + textMessage.getText());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
