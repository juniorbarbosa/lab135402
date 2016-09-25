package br.univel;

import br.univel.wsclient.venda.IOException_Exception;
import br.univel.wsclient.venda.ServletException_Exception;
import br.univel.wsclient.venda.Venda;
import br.univel.wsclient.venda.VendaJaxWS;
import br.univel.wsclient.venda.VendaJaxWSService;

public class VendaWS {

	public static void main(String[] args) {
		try {
			VendaJaxWSService service = new VendaJaxWSService();
			VendaJaxWS ews = service.getVendaJaxWSPort();
			Venda venda = ews.operacaoVenda();
			System.out.println(venda);
		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}
	}

}
