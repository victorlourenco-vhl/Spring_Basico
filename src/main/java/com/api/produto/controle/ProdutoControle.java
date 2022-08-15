package com.api.produto.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.produto.modelo.ProdutoModelo;
import com.api.produto.modelo.RespostaModelo;
import com.api.produto.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControle {
	
	// Ações
	@Autowired // Faz a injeção de dependências e indica que é um repositório
	private ProdutoRepositorio acoes;
	
	// Listar produtos
	@RequestMapping(value="/produtos", method=RequestMethod.GET)
	public @ResponseBody List<ProdutoModelo> listar() {
		return acoes.findAll();
	}
	
	// Cadastrar produto
	@RequestMapping(value="/produtos", method=RequestMethod.POST)
	public @ResponseBody ProdutoModelo cadastrar(@RequestBody ProdutoModelo produto) {
		return acoes.save(produto);
	}
	
	// Filtrar produtos
	@RequestMapping(value="/produtos/{id}", method=RequestMethod.GET)
	public @ResponseBody ProdutoModelo filtrar(@PathVariable Integer id) { // Vai trabalhar com url de variável
		return acoes.findByCodigo(id);
	}
	
	// Alterar produtos
	@RequestMapping(value="produtos", method=RequestMethod.PUT)
	public @ResponseBody ProdutoModelo alterar(@RequestBody ProdutoModelo produto) {
		return acoes.save(produto);
	}
	
	// Deletar produtos
	@RequestMapping(value="produtos/{id}",  method=RequestMethod.DELETE)
	public @ResponseBody RespostaModelo remover(@PathVariable Integer id) {
		
		RespostaModelo resposta = new RespostaModelo();
		
		try {
			ProdutoModelo produto = filtrar(id);
			this.acoes.delete(produto);
			resposta.setMensagem("Produto removido com sucesso");
		}catch(Exception erro) {
			resposta.setMensagem("Falha ao remover: " + erro.getMessage());
		}
		
		return resposta;
		
	}
	
	
}
