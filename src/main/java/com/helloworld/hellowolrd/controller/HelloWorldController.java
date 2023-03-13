package com.helloworld.hellowolrd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/lista-bsm")
	public List<String> listaBsm() {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Resonsabilidade pessoal");
		lista.add("Mentalidade de crescimento");
		lista.add("Orientação ao futuro");
		lista.add("Persistencia");
		lista.add("Comunicação");
		lista.add("Orientação aos Detalhes");
		lista.add("Trabalho em equipe");
		lista.add("Proatividade");
		
		return lista;
	}
	
	@GetMapping("/objetivos")
	public List<String>  ListaObjetivos(){
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Aprender Sprint boot");
		lista.add("Reforçar POO");
		lista.add("Melhorar Logica");
		
		return lista;
	}
}
