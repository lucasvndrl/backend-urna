package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.entidade.Candidato;
import com.example.demo.entidade.User;
import com.example.demo.service.CandidatoService;

@SpringBootApplication
@RestController
@RequestMapping("/candidato")
public class CandidatoRest {
	
	 	@Autowired
	    private RepositorioCandidato candidatoDAO;
	 	
	 	@Autowired
	 	private CandidatoService candidatoService; 

	 	 @GetMapping
	     @RequestMapping(value = "/list", method = RequestMethod.GET)
	     public List<Candidato> listar(){
	         return candidatoDAO.findAllCandidatos();
	     }

//	    @PostMapping
//	    @RequestMapping(value = "/save", method = RequestMethod.POST)
//	    public ResponseEntity<Candidato> salvar(@RequestBody Candidato candidato){
//	    	boolean candidatoVerify = this.candidatoService.verificadorCpfAndNumber(candidato);
//	    	if(!candidatoVerify) {
//	    		Candidato save = candidatoDAO.save(candidato);
//	    		return new ResponseEntity<Candidato>(save, HttpStatus.OK);
//	    	}else {
//	    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    	}
//	    }
	
}
