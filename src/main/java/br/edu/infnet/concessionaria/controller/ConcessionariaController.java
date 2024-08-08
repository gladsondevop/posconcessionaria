package br.edu.infnet.concessionaria.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.concessionaria.model.domain.Concessionaria;
import br.edu.infnet.concessionaria.model.service.ConcessionariaService;

@RestController
public class ConcessionariaController {

	@Autowired
	private ConcessionariaService concessionariaService;
	
	@GetMapping(value = "concessionaria/listar")
	public Collection<Concessionaria> obterLista(){
		return concessionariaService.obterLista();
	}
}
