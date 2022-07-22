package com.idat.EC3LeninAlbino_ReservaCitas.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "hospitales")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHospital;
    private String nombre;
    private String descripcion;
    private String distrito;

    @ManyToMany(mappedBy = "hospitales",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Cliente> clientes= new ArrayList<>();
}
