package br.edu.infnet.concessionaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.concessionaria.model.domain.Veiculo;
import br.edu.infnet.concessionaria.model.dto.VeiculoDTO;
import br.edu.infnet.concessionaria.model.service.VeiculoService;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping(value = "listar")
	public List<Veiculo> obterLista(){
		return veiculoService.obterLista();
	}
	
	@PostMapping("salvar")
	public String salvar(@RequestBody VeiculoDTO m){
		veiculoService.salvar(m);
		return "Veículo incluído com sucesso!";
	}
	
	@PutMapping("atualizar")
	public String atualizar(@RequestBody VeiculoDTO m){
		veiculoService.salvar(m);
		return "Veículo atualizado com sucesso!";
	}
	
	@DeleteMapping("excluir")
	public String excluir(@RequestBody Veiculo v){
		veiculoService.excluir(v.getId());
		return "Veículo excluído com sucesso!";
	}
}
