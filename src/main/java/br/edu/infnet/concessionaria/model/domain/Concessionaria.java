package br.edu.infnet.concessionaria.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class Concessionaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "O atributo NOME é de preenchimento obrigatório.")
	private String nome;
	private boolean ativa;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "idConcecionaria")
//	@JsonIgnore
	@JsonManagedReference
	private List<Veiculo> veiculos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	@Transient
	private String cep;
	
	public Concessionaria() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	@Override
	public String toString() {
		return id +";"+ nome +";"+ ativa +";"+ veiculos.size();
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
