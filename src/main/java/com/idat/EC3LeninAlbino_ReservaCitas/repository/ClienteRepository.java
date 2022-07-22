package com.idat.EC3LeninAlbino_ReservaCitas.repository;

import com.idat.EC3LeninAlbino_ReservaCitas.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
