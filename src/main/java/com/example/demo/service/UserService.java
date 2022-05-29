package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.database.RepositorioUsers;
import com.example.demo.entidade.User;

import antlr.collections.List;

@Service
public class UserService {
	@Autowired
	private RepositorioUsers userDAO;
	@Autowired
	private RepositorioCandidato candidatoDAO;
	
	public boolean verificadorCPF(User user) {
        boolean cpfExist = false;
        java.util.List<User> findAllUsers = this.userDAO.findAll();
        for (int i = 0; i < findAllUsers.size(); i++) {
            if(findAllUsers.get(i).getCpf().equals(user.getCpf())) {
                cpfExist = true;
            }
        }
        return cpfExist;
    }

    public User populateNameUser(User user) {
        ArrayList<String> listUsersNames = new ArrayList<String>();
        listUsersNames.add("Victor");
        listUsersNames.add("Renato");
        listUsersNames.add("Lucas");
        listUsersNames.add("Gabriel");
        Collections.shuffle(listUsersNames);
        for (int i = 0; i < listUsersNames.size(); i++) {
            user.setNomeUsuario(listUsersNames.get(i));
        }
        return user;
    }
	
}
