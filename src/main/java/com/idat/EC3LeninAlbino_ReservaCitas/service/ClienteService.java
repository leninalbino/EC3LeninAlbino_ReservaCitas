package com.idat.EC3LeninAlbino_ReservaCitas.service;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.entity.Cliente;

import java.util.List;

public interface ClienteService {
    void guardarCliente(ClienteDTORequest cliente);
    void actualizarCliente(ClienteDTORequest cliente);

    void eliminarCliente(Long id);

    List<ClienteDTOResponse>listarCliente();
    ClienteDTOResponse obtenerClienteId(Long id);
}
