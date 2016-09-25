package br.univel.webservice;

import java.io.IOException;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.univel.domain.Entrega;
import br.univel.ejb.ProcessEntrega;

@WebService
public class EntregaJaxWS {

	@EJB
	private ProcessEntrega processEntrega;

	@WebMethod(operationName = "operacaoEntrega")
	@WebResult(name = "resultadoEntrega")
	public Entrega doGet() throws ServletException, IOException {
		Entrega entrega = new Entrega();
		entrega.setIdEntrega(1);
		entrega.setEndereco("Av. Brasil");

		processEntrega.processarEntrega(entrega);
		
		return entrega;
	}

}
