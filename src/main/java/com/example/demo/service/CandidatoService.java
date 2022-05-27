package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.database.RepositorioUsers;
import com.example.demo.entidade.Candidato;
import com.example.demo.entidade.User;

@Service
public class CandidatoService {
	@Autowired
	private RepositorioUsers userDAO;
	@Autowired
	private RepositorioCandidato candidatoDAO;
	
	public Candidato verificarCandidato(Candidato candidato) {
		if (candidato != null) {
			return candidato;
		}
		return candidato;
	}
}
