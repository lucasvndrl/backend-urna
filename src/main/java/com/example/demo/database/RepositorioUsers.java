package com.example.demo.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.User;

@Repository
public interface RepositorioUsers extends JpaRepository<User, String>{
	@Query(value="SELECT * FROM TB_USUARIOS", nativeQuery=true)
	List<User> findAllUsers();
}
