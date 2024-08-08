package br.edu.infnet.concessionaria.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.concessionaria.model.domain.Motocicleta;
import br.edu.infnet.concessionaria.model.service.MotocicletaService;

@RestController
public class MotocicletaController {

	@Autowired
	private MotocicletaService motocicletaService;
	
	@GetMapping(value = "motocicleta/listar")
	public Collection<Motocicleta> obterLista(){
		return motocicletaService.obterLista();
	}
}
