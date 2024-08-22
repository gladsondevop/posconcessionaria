package br.edu.infnet.concessionaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.concessionaria.model.domain.Concessionaria;
import br.edu.infnet.concessionaria.model.domain.Veiculo;
import br.edu.infnet.concessionaria.model.service.ConcessionariaService;

@RestController
@RequestMapping("concessionaria")
public class ConcessionariaController {

	@Autowired
	private ConcessionariaService concessionariaService;
	
	@GetMapping("listar")
	public List<Concessionaria> obterLista(){
		return concessionariaService.obterLista();
	}
	
	@GetMapping("{id}")
	public Concessionaria obterPorId(@PathVariable(value = "id") Integer id) {
		return concessionariaService.obterPorId(id);
	}
	
	@PostMapping("salvar")
	public String salvar(@RequestBody Concessionaria c){
		concessionariaService.salvar(c);
		return "Concessionária incluída com sucesso!";
	}
	
	@PutMapping("atualizar")
	public String atualizar(@RequestBody Concessionaria c){
		concessionariaService.salvar(c);
		return "Concessionária atualizada com sucesso!";
	}
	
	@DeleteMapping("excluir")
	public String excluir(@RequestBody Concessionaria c){
		concessionariaService.excluir(c.getId());
		return "Concessionária excluída com sucesso!";
	}
	
	@GetMapping("{id}/obter-veiculos")
	public List<Veiculo> obterVeiculosPorIdConcessionaria(@PathVariable(value = "id") Integer id) {
		return concessionariaService.obterVeiculosPorIdConcessionaria(id);
	}
}
