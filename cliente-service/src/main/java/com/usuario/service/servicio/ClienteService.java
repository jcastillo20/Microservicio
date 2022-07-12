package com.usuario.service.servicio;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.usuario.service.entidades.Cliente;

public interface ClienteService {
	
	public List<Cliente> getAll();
	public Cliente getClienteById(int id);
	public List<Cliente> getClienteByDni(String dni);
	public List<Cliente> getClienteByEmail(String email);
	public Cliente save(Cliente cliente);
	public Cliente actualizarCliente(Cliente cliente);

}
