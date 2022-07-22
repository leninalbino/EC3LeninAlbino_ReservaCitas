package com.idat.EC3LeninAlbino_ReservaCitas.controller;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/guardar")
    public @ResponseBody void guardarCliente(@RequestBody ClienteDTORequest clienteDTORequest){
        clienteService.guardarCliente(clienteDTORequest);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizarCliente(@RequestBody ClienteDTORequest clienteDTORequest){
        clienteService.actualizarCliente(clienteDTORequest);
    }
    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminarCliente(@PathVariable("id") Long id){
        clienteService.eliminarCliente(id);
    }
    @GetMapping("/listar")
    public @ResponseBody List<ClienteDTOResponse> listarCliente(){
        return clienteService.listarCliente();
    }
    @GetMapping("/listar/{id}")
    public  @ResponseBody ClienteDTOResponse listarPorId(@PathVariable("id") Long id){
        return clienteService.obtenerClienteId(id);
    }

}
