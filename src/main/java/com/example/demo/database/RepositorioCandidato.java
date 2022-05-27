package com.example.demo.database;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Candidato;

@Repository
public interface RepositorioCandidato extends JpaRepository<Candidato, Long>{

	@Query(value="SELECT CD_PREFEITO, NU_PREFEITO FROM TB_PREFEITOS", nativeQuery=true)
	List<Candidato> findAllCandidatos();
	
}
