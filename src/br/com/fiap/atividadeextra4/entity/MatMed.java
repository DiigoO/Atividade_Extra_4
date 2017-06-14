package br.com.fiap.atividadeextra4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATMED")
public class MatMed implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5001997925031764163L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMATMED")
	private int id;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PRECO")
	private double preco;
	
	@Column(name = "FABRICANTE")
	private String fabricante;
	
	@Column(name = "CPFPAC")
	private String cpfpac;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCpfpac() {
		return cpfpac;
	}

	public void setCpfpac(String cpfpac) {
		this.cpfpac = cpfpac;
	}

	
	
}
