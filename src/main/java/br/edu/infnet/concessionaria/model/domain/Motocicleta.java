package br.edu.infnet.concessionaria.model.domain;

public class Motocicleta extends Veiculo {
	
	private int cilindrada;
	private String transmissao;
	private String tipoTerreno;
	
	@Override
	public String toString() {
		return String.format("%s;%s;%s", 
				super.toString(),
				transmissao,
				tipoTerreno);
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
