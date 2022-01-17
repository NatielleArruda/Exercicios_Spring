package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	@GetMapping("/Habilidades")
	public String habilidades() {
		return "Persistência";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Persistir e nunca desistir.";
	}

}
