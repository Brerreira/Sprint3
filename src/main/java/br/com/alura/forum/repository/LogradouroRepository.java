package br.com.alura.forum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.modelo.Logradouro;


@Repository
public interface LogradouroRepository extends CrudRepository<Logradouro, Long> {

	
	
}
