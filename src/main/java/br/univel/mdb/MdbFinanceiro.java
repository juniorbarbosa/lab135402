package br.univel.mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import br.univel.domain.Venda;

@MessageDriven(name = "MdbFinanceiro", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1") })
public class MdbFinanceiro implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbFinanceiro.class.toString());

	@Override
	public void onMessage(Message receivedMsg) {
		ObjectMessage msg = null;
		try {
			if (receivedMsg instanceof ObjectMessage) {
				msg = (ObjectMessage) receivedMsg;
				Venda venda = (Venda) msg.getObject();
				LOGGER.info("Objeto recebido: " + venda);
			} else {
				LOGGER.warning("Objeto do tipo errado: " + receivedMsg.getClass().getName());
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}