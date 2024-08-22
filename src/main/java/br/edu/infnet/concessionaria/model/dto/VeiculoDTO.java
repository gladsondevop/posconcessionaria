package br.edu.infnet.concessionaria.model.dto;

import br.edu.infnet.concessionaria.model.domain.Concessionaria;

public class VeiculoDTO {
	
	private String tipoVeiculo;
	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	private String descricao;
	private float valor;
	private Concessionaria concessionaria;
	
	//automovel
	private boolean utilitario;
	private String motorizacao;
	private int capacidadePassageiro;
	private int capacidadeCarga;
	
	//motocicleta
	private int cilindrada;
	private String transmissao;
	private String tipoTerreno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Concessionaria getConcessionaria() {
		return concessionaria;
	}
	public void setConcessionaria(Concessionaria concessionaria) {
		this.concessionaria = concessionaria;
	}
	public boolean isUtilitario() {
		return utilitario;
	}
	public void setUtilitario(boolean utilitario) {
		this.utilitario = utilitario;
	}
	public String getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}
	public int getCapacidadePassageiro() {
		return capacidadePassageiro;
	}
	public void setCapacidadePassageiro(int capacidadePassageiro) {
		this.capacidadePassageiro = capacidadePassageiro;
	}
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getTransmissao() {
		return transmissao;
	}
	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
	public String getTipoTerreno() {
		return tipoTerreno;
	}
	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}
}
