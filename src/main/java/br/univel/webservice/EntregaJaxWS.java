package br.univel.webservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.domain.Entrega;
import br.univel.ejb.ProcessEntrega;

@WebService
public class EntregaJaxWS {

	@EJB
	private ProcessEntrega processEntrega;

	@WebMethod(operationName = "operacaoEntrega")
	@WebResult(name = "resultadoEntrega")
	protected void doGet(@WebParam(name = "requisicao") HttpServletRequest req, @WebParam(name = "resposta") HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Iniciando entrega...");

		Entrega entrega = new Entrega();
		entrega.setIdEntrega(1);
		entrega.setEndereco("Av. Brasil");

		processEntrega.processarEntrega(entrega);

		out.write("Entrega Efetuada...");
	}

}
