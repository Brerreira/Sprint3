package br.com.alura.forum.controller.dto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Logradouro;
import br.com.alura.forum.repository.LogradouroRepository;


@RequestMapping("/api/states")
@RestController
class LogradouroController {

	@Autowired
	private LogradouroRepository repository;
	
	
	@GetMapping
	public List<LogradouroDto> enderecos(){
		
		Logradouro logradouro = new Logradouro(12, "Rio grande do norte", "Nordeste", 3409000, "Natal", 52.797);
		return LogradouroDto.converter(Arrays.asList(logradouro, logradouro, logradouro, logradouro, logradouro));
	}

	
	@PostMapping
	public Logradouro post(@RequestBody Logradouro logradouro) {
		return repository.save(logradouro);
	}
	
	@DeleteMapping(path = "{id}")
	public String delete(@PathVariable("id") Long id) {
		repository.deleteById(id);
		return "Apagado com sucesso";
	}
	
	
	@PutMapping(path = "/{id}")
	public Logradouro put(@RequestBody Logradouro logradouro) {
		return repository.save(logradouro);
	}
	
	
}
