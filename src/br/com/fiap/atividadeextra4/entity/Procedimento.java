package br.com.fiap.atividadeextra4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROCEDIMENTO")
public class Procedimento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 701763562681079136L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPROCEDIMENTO")
	private int id;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PRECO")
	private double preco;
	
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

	public String getCpfpac() {
		return cpfpac;
	}

	public void setCpfpac(String cpfpac) {
		this.cpfpac = cpfpac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
