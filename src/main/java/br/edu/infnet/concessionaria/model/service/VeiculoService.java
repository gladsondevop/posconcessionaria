package br.edu.infnet.concessionaria.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.concessionaria.model.domain.Automovel;
import br.edu.infnet.concessionaria.model.domain.Motocicleta;
import br.edu.infnet.concessionaria.model.domain.Veiculo;
import br.edu.infnet.concessionaria.model.dto.VeiculoDTO;
import br.edu.infnet.concessionaria.model.repository.AutomovelRepository;
import br.edu.infnet.concessionaria.model.repository.MotocicletaRepository;
import br.edu.infnet.concessionaria.model.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private MotocicletaRepository Motocicletaepository;
	@Autowired
	private AutomovelRepository automovelRepository;
	
	public List<Veiculo> obterLista() {
		return veiculoRepository.findAll();
	}
	
	public void salvar(VeiculoDTO veiculo) {
		if(veiculo.getTipoVeiculo().equals("M")) {
			Motocicletaepository.save(new Motocicleta().dtoToMotocicleta(veiculo));
		} else {
			automovelRepository.save(new Automovel().dtoToMotocicleta(veiculo));
		}
	}
	
	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
}
