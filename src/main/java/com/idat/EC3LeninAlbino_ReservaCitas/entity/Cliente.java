package com.idat.EC3LeninAlbino_ReservaCitas.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nombre;
    private Integer celular;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "clientes_hospitales",
                joinColumns = @JoinColumn(  name = "id_cliente",
                                            nullable = false,
                                            unique = true,
                                            foreignKey = @ForeignKey(foreignKeyDefinition =
                                            "foreign key (id_cliente) references clientes(id_cliente)")
                ),
                inverseJoinColumns = @JoinColumn(   name = "id_hospital",
                                                    nullable = false,
                                                    unique = true,
                                                    foreignKey = @ForeignKey(foreignKeyDefinition =
                                                    "foreign key (id_hospital) references hospitales(id_hospital)")))
    private List<Hospital> hospitales= new ArrayList<>();

    //@OneToOne(mappedBy = "idUsuario")
   // private UsuarioCliente usuarioCliente;

}
