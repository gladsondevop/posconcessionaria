package br.edu.infnet.concessionaria.model.domain;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	private String descricao;
	private float valor;
	
	@Override
	public String toString() {
		return String.format("%d;%s;%s;%d;%d;%s;%.2f", 
				id,
				marca,
				modelo,
				anoFabricacao,
				anoModelo,
				descricao,
				valor);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
}
