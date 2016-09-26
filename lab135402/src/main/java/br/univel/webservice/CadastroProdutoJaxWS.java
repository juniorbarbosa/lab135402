package br.univel.webservice;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.univel.ejb.CadastroProduto;
import br.univel.model.Produto;

@WebService
public class CadastroProdutoJaxWS {

	@EJB
	private CadastroProduto em;

	@WebMethod(operationName = "criarProduto")
	@WebResult(name = "retornoCriacaoProduto")
	public void create(@WebParam(name = "produto") Produto produto) {
		em.create(produto);
	}

	@WebMethod(operationName = "listaProduto")
	@WebResult(name = "retornoListaProduto")
	public List<Produto> read() {
		List<Produto> findAllQuery = em.read();
		return findAllQuery;
	}

	@WebMethod(operationName = "alterarProduto")
	@WebResult(name = "retornoAlteracaoProduto")
	public void update(@WebParam(name = "produto") Produto produto) {
		em.update(produto);
	}

	@WebMethod(operationName = "deletarProduto")
	@WebResult(name = "retornoDeleteProduto")
	public void delete(@WebParam(name = "produtoId") Long id) {
		em.delete(id);
	}

}
