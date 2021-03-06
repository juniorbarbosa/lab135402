package br.univel.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.univel.domain.Entrega;
import br.univel.domain.Venda;
import br.univel.model.Log;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1") })
public class MdbLogistica implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@PersistenceContext(unitName = "lab135402-persistence-unit")
	private EntityManager em;

	@Override
	public void onMessage(Message receivedMsg) {
		ObjectMessage msg = null;
		try {
			if (receivedMsg instanceof ObjectMessage) {
				msg = (ObjectMessage) receivedMsg;
				Entrega entrega = (Entrega) msg.getObject();

				Log log = new Log();
				log.setMdb(MdbLogistica.class.toString());
				log.setData("01/01/0000");
				log.setHora("00:00:00");
				log.setInformacoes("Objeto recebido: " + entrega);

				em.persist(log);

//				LOGGER.info("Objeto recebido: " + entrega);

				LOGGER.info("Mensagem recebida");
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LOGGER.info("Entrega despachada");
			} else {
				LOGGER.warning("Objeto do tipo errado: " + receivedMsg.getClass().getName());
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}