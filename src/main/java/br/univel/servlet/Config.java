package br.univel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@JMSDestinationDefinitions(value = {
//		@JMSDestinationDefinition(name = "java:/queue/QueuePedido", interfaceName = "javax.jms.Queue", destinationName = "QueuePedido"),
//		@JMSDestinationDefinition(name = "java:/topic/TopicVenda", interfaceName = "javax.jms.Topic", destinationName = "TopicVenda") })
@WebServlet("/Config")
public class Config extends HttpServlet {

	private static final long serialVersionUID = -1174969012687162808L;
	
	@Inject
	private JMSContext context;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("Config");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
