package br.com.fiap.atividadeextra4.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5394012692827366502L;

	@Id
	@Column(name = "CPFPACIENTE")
	private String cpf;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DATANASC")
	private Date datanasc;
	
	@Column(name = "TELEFONE")
	private String telefone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
