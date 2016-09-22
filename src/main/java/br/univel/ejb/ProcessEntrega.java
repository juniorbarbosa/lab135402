package br.univel.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import br.univel.domain.Entrega;

@Stateless
public class ProcessEntrega {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;

	public void processarEntrega(Entrega entrega) {
		try {
			final Destination destination = queue;
			ObjectMessage objectMessage = context.createObjectMessage();
			objectMessage.setObject(entrega);
			context.createProducer().send(destination, objectMessage);
		} catch (Throwable th) {
			th.printStackTrace();
		}
	}

}
