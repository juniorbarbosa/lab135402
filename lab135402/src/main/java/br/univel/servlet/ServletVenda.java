package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.domain.Venda;
import br.univel.ejb.ProcessVenda;

@WebServlet("/venda")
public class ServletVenda extends HttpServlet {

	private static final long serialVersionUID = 2453534222446927384L;
	
	@EJB
	private ProcessVenda processVenda;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Iniciando venda...");

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
		out.write("Venda efetuada.");

	}

}
