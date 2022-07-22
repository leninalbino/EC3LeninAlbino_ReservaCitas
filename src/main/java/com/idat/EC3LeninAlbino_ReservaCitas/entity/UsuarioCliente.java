package com.idat.EC3LeninAlbino_ReservaCitas.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="usuariosClientes")
public class UsuarioCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String usuario;
    private String password;
    private String rol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    private Cliente cliente;
}
