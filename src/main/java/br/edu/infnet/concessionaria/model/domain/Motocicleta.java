package br.edu.infnet.concessionaria.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.concessionaria.model.dto.VeiculoDTO;

@Entity
@Table
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
	
	public Motocicleta dtoToMotocicleta(VeiculoDTO dto) {
		this.setId(dto.getId());
		this.setMarca(dto.getMarca());
		this.setModelo(dto.getModelo());
		this.setAnoFabricacao(dto.getAnoFabricacao());
		this.setAnoModelo(dto.getAnoModelo());
		this.setDescricao(dto.getDescricao());
		this.setValor(dto.getValor());
		this.setConcessionaria(dto.getConcessionaria());
		this.setCilindrada(dto.getCilindrada());
		this.setTransmissao(dto.getTransmissao());
		this.setTipoTerreno(dto.getTipoTerreno());
		
		return this;
	}

}
