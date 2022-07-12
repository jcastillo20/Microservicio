package com.usuario.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.usuario.service.entidades.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List<Cliente> findAllBydni(String dni);
	List<Cliente> findAllByemail(String  email);

}
