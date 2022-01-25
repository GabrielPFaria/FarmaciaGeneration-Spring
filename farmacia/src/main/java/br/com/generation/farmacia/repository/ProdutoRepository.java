package br.com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {

	//findAllByTituloContainingIgnoreCase selecionado de acordo com o atributo
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
}
