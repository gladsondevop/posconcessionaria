package br.edu.infnet.concessionaria.model.domain;

public class Automovel extends Veiculo {
	
	private boolean utilitario;
	private String motorizacao;
	private int capacidadePassageiro;
	private int capacidadeCarga;
	
	@Override
	public String toString() {
		return String.format("%s;%s;%d;%d", 
				super.toString(),
				utilitario ? "utilitário=sim" : "utilitário=sim",
				capacidadePassageiro,
				capacidadeCarga);
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

}
