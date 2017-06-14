package br.com.fiap.atividadeextra4.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDA")
public class Agenda implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7247708420035714892L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCLIENTE")
	private int id;
	
	@Column(name = "DATA")
	private Date data;
	
	@Column(name = "HORA")
	private Date hora;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
