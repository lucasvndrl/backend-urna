package com.example.demo.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PREFEITOS", schema = "urna")
public class Candidato implements Serializable {
	
	@Id
	@Column(name = "CD_PREFEITO")
	private String codPrefeito;
	
	@Column(name= "NU_PREFEITO", nullable = false)
	private String nomePrefeito;
	
	public String getNomePrefeito() {
		return nomePrefeito;
	}
	public void setNomePrefeito(String nomePrefeito) {
		this.nomePrefeito = nomePrefeito;
	}
	
	public String getCod() {
		return codPrefeito;
	}
	public void setCod(String codPrefeito) {
		this.codPrefeito = codPrefeito;
	}
	
}
