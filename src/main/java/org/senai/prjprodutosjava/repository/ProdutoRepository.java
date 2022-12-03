package org.senai.prjprodutosjava.repository;
import org.senai.prjprodutosjava.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer>{
    
}

