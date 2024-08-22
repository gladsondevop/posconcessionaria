package br.edu.infnet.concessionaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

//	@GetMapping(value = "/")
	public String exibirMensagemAlow() {
		return "Olá... você acabou de entrar na Concessionária!!!";
	}
	
//	@GetMapping(value = "/home")
	public String exibirHome() {
		return "Gladson Cunha de Albuquerque";
	}
}
