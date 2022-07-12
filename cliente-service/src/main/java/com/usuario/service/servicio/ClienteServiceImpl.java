package com.usuario.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.usuario.service.entidades.Cliente;
import com.usuario.service.repositorio.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Cliente getClienteById(int id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> getClienteByDni(String dni) {
		// TODO Auto-generated method stub
		return clienteRepository.findAllBydni(dni);
	}

	@Override
	public List<Cliente> getClienteByEmail(String email) {
		// TODO Auto-generated method stub
		return clienteRepository.findAllByemail(email);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente nuevoCliente=clienteRepository.save(cliente);
		return nuevoCliente;
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente clienteBD = getClienteById(cliente.getId());
		if(null == clienteBD) {
			return null;
		}
		clienteBD.setNombres(cliente.getNombres());
		clienteBD.setApellidos(cliente.getApellidos());
		clienteBD.setEmail(cliente.getEmail());
		clienteBD.setDni(cliente.getDni());
		clienteBD.setFecha_nacimiento(cliente.getFecha_nacimiento());
		return clienteRepository.save(clienteBD);
	}

	
	
	
}
