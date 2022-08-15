package com.api.produto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produto.modelo.ProdutoModelo;

// Primeiro parâmetro: O elemente que é utilizado como base para manipular dados (cadastrar, selecionar...)
// Segundo parâmetro: O tipo do indentificador (ID - Integer...)
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{

	// Listar todos os produtos
	List<ProdutoModelo> findAll();
	
	// Pesquisar por código
	ProdutoModelo findByCodigo(int codigo);
	
	// Remover produto
	void delete(ProdutoModelo produto);
	
	// Cadastrar / Alterar produto
	<ProdMod extends ProdutoModelo> ProdMod save(ProdMod produto);
	
}
