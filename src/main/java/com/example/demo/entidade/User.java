package com.example.demo.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIOS", schema = "urna")
public class User {
	@Id
	@Column(name = "CPF_USUARIO")
	private String cpf;
	
	@Column(name = "NO_USUARIO", nullable = true)
	private String nomeUsuario;
	
//	@MapsIdd
//	@OneToOne
	@Column(name = "CD_PREFEITO", nullable = true)
	private String codPrefeito;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCodPrefeito() {
		return codPrefeito;
	}

	public void setCodPrefeito(String codPrefeito) {
		this.codPrefeito = codPrefeito;
	}
	
}
