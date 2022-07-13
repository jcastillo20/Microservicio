package com.usuario.service.controlador;

import com.usuario.service.entidades.Cliente;
import com.usuario.service.repositorio.ClienteRepository;
import com.usuario.service.servicio.ClienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ClienteControllerTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteController clienteController;

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        cliente= new Cliente();
        cliente.setId(1);
        cliente.setNombres("Juan Aurelio");
        cliente.setApellidos("Castillo Rodriguez");
        cliente.setDni("75906047");
        cliente.setEmail("juancrcastillo@gmail.com");
        cliente.setFecha_nacimiento(Date.valueOf("1996-04-20"));
    }

    @Test
    void listarClientes() {
        when(clienteRepository.findAll()).thenReturn(Arrays.asList(cliente));
        assertNotNull(clienteController.listarClientes(null,null));
    }
    
    @Test
    void obtenerCliente() {
        when(clienteRepository.findAll()).thenReturn(Arrays.asList(cliente));
        assertNotNull(clienteController.obtenerCliente(1));
    }
}