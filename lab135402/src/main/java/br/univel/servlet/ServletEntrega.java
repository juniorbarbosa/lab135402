package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.domain.Entrega;
import br.univel.ejb.ProcessEntrega;

@WebServlet("/entrega")
public class ServletEntrega extends HttpServlet {
	
	private static final long serialVersionUID = -1366352921478802426L;
	@EJB
	private ProcessEntrega processEntrega;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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