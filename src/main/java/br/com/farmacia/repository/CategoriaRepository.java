package br.com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
