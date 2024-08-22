package br.edu.infnet.concessionaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Concessionaria;
import br.edu.infnet.concessionaria.model.domain.Veiculo;
import br.edu.infnet.concessionaria.model.repository.ConcessionariaRepository;

@Service
public class ConcessionariaService {
	
	@Autowired
	private ConcessionariaRepository concessionariaRepository;

	@Autowired
	private EnderecoService enderecoService;
	
	public void salvar(Concessionaria concessionaria) {
		if(concessionaria.getCep() != null)
			concessionaria.setEndereco(enderecoService.obterPorCep(concessionaria.getCep()));
		concessionariaRepository.save(concessionaria);
	}
	
	public List<Concessionaria> obterLista(){
		return concessionariaRepository.findAll();
	}
	
	public Concessionaria obterPorId(Integer id) {
		return concessionariaRepository.findById(id).orElse(null);
	}
	
	public List<Veiculo> obterVeiculosPorIdConcessionaria(Integer id) {
		return concessionariaRepository.findById(id).get().getVeiculos();
	}
	
	public void excluir(Integer id) {
		concessionariaRepository.deleteById(id);
	}
}
