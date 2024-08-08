package br.edu.infnet.concessionaria.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
	
	private Integer id;
	private String nome;
	private Concessionaria sede;
	private boolean ativa;
	
	private List<Veiculo> veiculos;
	
	public Concessionaria() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	@Override
	public String toString() {
		return id +";"+ nome +";"+ sede +";"+ ativa +";"+ veiculos.size();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Concessionaria getSede() {
		return sede;
	}
	public void setSede(Concessionaria sede) {
		this.sede = sede;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
