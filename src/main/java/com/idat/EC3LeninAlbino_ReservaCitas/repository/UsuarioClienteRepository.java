package com.idat.EC3LeninAlbino_ReservaCitas.repository;

import com.idat.EC3LeninAlbino_ReservaCitas.entity.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente,Long> {
    UsuarioCliente findByUsuario(String usuario);
}
