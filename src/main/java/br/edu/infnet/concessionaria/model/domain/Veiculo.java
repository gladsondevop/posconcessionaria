package br.edu.infnet.concessionaria.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String marca;
	private String modelo;
	
	@Min(value = 2015, message = "Só são aceitos veículos com ano de fabricação a partir de 2015.")
	private int anoFabricacao;
	
	@Min(value = 2015, message = "Só são aceitos veículos com ano modelo a partir de 2015.")
	private int anoModelo;
	
	@NotBlank(message = "O atributo DESCRIÇÃO é de preenchimento obrigatório.")
	private String descricao;
	
	private float valor;
	
	@ManyToOne
	@JoinColumn(name = "idConcecionaria")
//	@JsonManagedReference
	@JsonBackReference
	private Concessionaria concessionaria;
	
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
	public Concessionaria getConcessionaria() {
		return concessionaria;
	}
	public void setConcessionaria(Concessionaria concessionaria) {
		this.concessionaria = concessionaria;
	}
}
