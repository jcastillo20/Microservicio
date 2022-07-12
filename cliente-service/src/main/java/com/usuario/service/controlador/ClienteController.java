package com.usuario.service.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.usuario.service.entidades.Cliente;
import com.usuario.service.servicio.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listarClientes(@RequestParam(name = "dni",required = false)String dni,@RequestParam(name = "email",required = false)String email){
		List<Cliente> clientes= new ArrayList<>();
		
		if(null == dni && null == email) {
			clientes = clienteService.getAll();
			if(clientes.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
		}else if (null != dni && null == email) {
			clientes = clienteService.getClienteByDni(dni);
			if(clientes.isEmpty()) {
				return ResponseEntity.notFound().build();
			}
		}else if (null == dni && null != email) {
			clientes = clienteService.getClienteByEmail(email);
			if(clientes.isEmpty()) {
				return ResponseEntity.notFound().build();
			}
		}
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping("/{id}")
	public Cliente obtenerCliente(@PathVariable("id") int id){
		Cliente cliente = clienteService.getClienteById(id);
		if(cliente == null) {
			return cliente;
		}
		return cliente;
		
	}
	
	@GetMapping("/dni/{dni}")
	public List<Cliente> obtenerClienteDni(@PathVariable("dni") String dni){
		List<Cliente> cliente = clienteService.getClienteByDni(dni);
		if(cliente == null) {
			return cliente;
		}
		return cliente;
		
	}


	@GetMapping("/email/{email}")
	public List<Cliente> obtenerClienteEmail(@PathVariable("email") String email){
		List<Cliente> cliente = clienteService.getClienteByEmail(email);
		if(cliente == null) {
			return cliente;
		}
		return cliente;
		
	}
	
	@PostMapping
	public ResponseEntity<Cliente> guardarCliente(@Valid @RequestBody Cliente cliente){
			Cliente nuevoCliente = clienteService.save(cliente);
			return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCliente);
	}
	

}
