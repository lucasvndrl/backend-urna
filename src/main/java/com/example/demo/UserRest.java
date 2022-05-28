package com.example.demo;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositorioUsers;
import com.example.demo.entidade.User;
import com.example.demo.service.UserService;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class UserRest {
	
    @Autowired
    private RepositorioUsers userDAO;
    @Autowired
    private UserService userService;
    
    @GetMapping
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> listar(){
        return userDAO.findAll();
    }
    
    @GetMapping
    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public User listById(@PathVariable String id){
    	User usuario = null;
    	
    	List<User> usuarios = this.listar();
    	
    	for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCpf().equals(id)) {
                usuario = usuarios.get(i);
            }
        }
    	
    	return usuario;
    }
    
    @PostMapping
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<User> salvar(@RequestBody User user){
    	boolean userVerify = this.userService.verificadorCPF(user);
    	if(!userVerify) {
    		this.userService.populateNameUser(user);
    		User save = userDAO.save(user);
    		return new ResponseEntity<User>(save, HttpStatus.OK);
    	}else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }

//    @DeleteMapping("/{id}")
//    @RequestMapping(value = "/excluir/{id}", method= RequestMethod.DELETE)
//    public ResponseEntity<Object> excluir(@PathVariable(value = "id") Long id){
//    	Optional<User> user = userDAO.findById(id);
//    	if(user.isPresent()){
//    		userDAO.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }else {
//        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}