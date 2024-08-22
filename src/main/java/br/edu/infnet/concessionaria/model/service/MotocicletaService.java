package br.edu.infnet.concessionaria.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Motocicleta;
import br.edu.infnet.concessionaria.model.repository.MotocicletaRepository;

@Service
public class MotocicletaService {

	@Autowired
	private MotocicletaRepository motocicletaRepository;
	
	public void incluir(Motocicleta motocicleta) {
		motocicletaRepository.save(motocicleta);
	}
	
	public Collection<Motocicleta> obterLista(){
		return motocicletaRepository.findAll();
	}
}
