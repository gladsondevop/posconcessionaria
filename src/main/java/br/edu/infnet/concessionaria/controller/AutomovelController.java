package br.edu.infnet.concessionaria.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.concessionaria.model.domain.Automovel;
import br.edu.infnet.concessionaria.model.service.AutomovelService;

@RestController
public class AutomovelController {

	@Autowired
	private AutomovelService automovelService;
	
	@GetMapping(value = "automovel/listar")
	public Collection<Automovel> obterLista(){
		return automovelService.obterLista();
	}
}
