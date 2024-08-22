package br.edu.infnet.concessionaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Automovel;
import br.edu.infnet.concessionaria.model.repository.AutomovelRepository;

@Service
public class AutomovelService {

	@Autowired
	private AutomovelRepository automovelRepository;
	
	public void incluir(Automovel automovel) {
		automovelRepository.save(automovel);
	}
	
	public Collection<Automovel> obterLista() {
		return automovelRepository.findAll();
	}
}
