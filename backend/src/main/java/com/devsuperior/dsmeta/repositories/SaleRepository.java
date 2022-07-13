package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//Responsável por ACESSAR O BD e fazer os comandos SQL (salvar, buscar, deletar ...)

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
