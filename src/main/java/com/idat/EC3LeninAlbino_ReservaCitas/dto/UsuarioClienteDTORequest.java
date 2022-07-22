package com.idat.EC3LeninAlbino_ReservaCitas.dto;

import lombok.Data;

@Data
public class UsuarioClienteDTORequest {
    private Long idUsuario;
    private String usuario;
    private String password;
    private String rol;
}
