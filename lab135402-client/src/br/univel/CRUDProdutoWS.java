package br.univel;

import java.util.List;

import br.univel.wsclient.crudproduto.CadastroProdutoJaxWS;
import br.univel.wsclient.crudproduto.CadastroProdutoJaxWSService;
import br.univel.wsclient.crudproduto.Produto;

public class CRUDProdutoWS {

	public static void main(String[] args) {
		CadastroProdutoJaxWSService service = new CadastroProdutoJaxWSService();
		CadastroProdutoJaxWS ews = service.getCadastroProdutoJaxWSPort();

		Produto produto = new Produto();
		produto.setCodigoBarra("0123-4567-8900");
		produto.setDescricao("PS4");
		produto.setPreco(2000);

		ews.criarProduto(produto);

		List<Produto> listaProduto = ews.listaProduto();

		for (Produto p : listaProduto) {
			System.out.println(p.getDescricao());
		}

		produto.setCodigoBarra("0123-4567-8900");
		produto.setDescricao("PS4");
		produto.setPreco(3000);

		ews.alterarProduto(produto);

		ews.deletarProduto(1L);

	}

}
