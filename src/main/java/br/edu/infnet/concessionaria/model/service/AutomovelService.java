package br.edu.infnet.concessionaria.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Automovel;

@Service
public class AutomovelService {

	private Map<Integer, Automovel> mapa = new HashMap<Integer, Automovel>();
	private Integer id = 0;			
	
	public void incluir(Automovel automovel) {
		automovel.setId(++id);
		
		mapa.put(automovel.getId(), automovel);
	}
	
	public Collection<Automovel> obterLista(){
		return mapa.values();
	}
}
