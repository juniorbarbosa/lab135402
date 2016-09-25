package br.univel.webservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.univel.domain.Venda;
import br.univel.ejb.ProcessVenda;

@WebService
public class VendaJaxWS {

	@EJB
	private ProcessVenda processVenda;

	@WebMethod(operationName = "operacaoVenda")
	@WebResult(name = "resultadoVenda")
	public Venda doGet() throws ServletException, IOException {
		List<String> listaItens = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			listaItens.add("Item " + i);
		}

		Venda venda = new Venda();
		venda.setIdVenda(1);
		venda.setNomeCliente("Joao");
		venda.setValor(100);
		venda.setItens(listaItens);

		processVenda.processarVenda(venda);
		
		return venda;
	}

}
