package br.edu.infnet.concessionaria.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Concessionaria;

@Service
public class ConcessionariaService {

	private Map<Integer, Concessionaria> mapa = new HashMap<Integer, Concessionaria>();
	private Integer id = 0;
	
	public void incluir(Concessionaria concessionaria) {
		concessionaria.setId(++id);
		
		mapa.put(concessionaria.getId(), concessionaria);
	}
	
	public Collection<Concessionaria> obterLista(){
		return mapa.values();
	}
}
