package br.univel;

import br.univel.wsclient.entrega.Entrega;
import br.univel.wsclient.entrega.EntregaJaxWS;
import br.univel.wsclient.entrega.EntregaJaxWSService;
import br.univel.wsclient.entrega.IOException_Exception;
import br.univel.wsclient.entrega.ServletException_Exception;

public class EntregaWS {
	
	public static void main(String[] args) {
		try {
			EntregaJaxWSService service = new EntregaJaxWSService();
			EntregaJaxWS ews = service.getEntregaJaxWSPort();
			Entrega entrega = ews.operacaoEntrega();
			System.out.println(entrega);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
		
	}

}
