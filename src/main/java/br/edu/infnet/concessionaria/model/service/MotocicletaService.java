package br.edu.infnet.concessionaria.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Motocicleta;

@Service
public class MotocicletaService {

	private Map<Integer, Motocicleta> mapa = new HashMap<Integer, Motocicleta>();
	private Integer id = 0;			
	
	public void incluir(Motocicleta motocicleta) {
		motocicleta.setId(++id);
		
		mapa.put(motocicleta.getId(), motocicleta);
	}
	
	public Collection<Motocicleta> obterLista(){
		return mapa.values();
	}
}
