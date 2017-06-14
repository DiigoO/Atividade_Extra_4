package br.com.fiap.atividadeextra4.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDAPACIENTE")
public class AgendaPaciente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8274072630277167846L;

	@Id
	@Column(name = "AGENDAID")
	private int agenda_id;
	
	@Column(name = "PACIENTECPF")
	private String paciente_cpf;

	public int getAgenda_id() {
		return agenda_id;
	}

	public void setAgenda_id(int agenda_id) {
		this.agenda_id = agenda_id;
	}

	public String getPaciente_cpf() {
		return paciente_cpf;
	}

	public void setPaciente_cpf(String paciente_cpf) {
		this.paciente_cpf = paciente_cpf;
	}
	
	
	
}
