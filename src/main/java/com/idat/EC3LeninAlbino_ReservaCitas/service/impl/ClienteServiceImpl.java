package com.idat.EC3LeninAlbino_ReservaCitas.service.impl;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.entity.Cliente;
import com.idat.EC3LeninAlbino_ReservaCitas.repository.ClienteRepository;
import com.idat.EC3LeninAlbino_ReservaCitas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void guardarCliente(ClienteDTORequest cliente) {
        Cliente c = new Cliente();
        c.setNombre(cliente.getNombre());
        c.setCelular(cliente.getCelular());
        clienteRepository.save(c);
    }

    @Override
    public void actualizarCliente(ClienteDTORequest cliente) {
        Cliente c = new Cliente();
        c.setNombre(cliente.getNombre());
        c.setCelular(cliente.getCelular());
        clienteRepository.saveAndFlush(c);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<ClienteDTOResponse> listarCliente() {
        List<ClienteDTOResponse>listas= new ArrayList<>();
        ClienteDTOResponse dto =null;
        List<Cliente> c = clienteRepository.findAll();
        for (Cliente clientes: c){
            dto = new ClienteDTOResponse();
            dto.setNombre(clientes.getNombre());
            dto.setCelular(clientes.getCelular());
            dto.setIdCLiente(clientes.getIdCliente());
            listas.add(dto);
        }
        return listas;
    }

    @Override
    public ClienteDTOResponse obtenerClienteId(Long id) {
        Cliente cliente= clienteRepository.findById(id).orElse(null);
        ClienteDTOResponse dto = new ClienteDTOResponse();
        dto.setNombre(cliente.getNombre());
        dto.setCelular(cliente.getCelular());
        dto.setIdCLiente(cliente.getIdCliente());
        return dto;
    }
}
