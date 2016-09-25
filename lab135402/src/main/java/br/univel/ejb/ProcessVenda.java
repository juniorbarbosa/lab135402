package br.univel.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import br.univel.domain.Venda;

@Stateless
public class ProcessVenda {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;

	public void processarVenda(Venda venda) {
		try {
			final Destination destination = topic;
			ObjectMessage objectMessage = context.createObjectMessage();
			objectMessage.setObject(venda);
			context.createProducer().send(destination, objectMessage);
		} catch (Throwable th) {
			th.printStackTrace();
		}
	}

}
