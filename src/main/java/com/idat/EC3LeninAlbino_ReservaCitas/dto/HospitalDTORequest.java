package com.idat.EC3LeninAlbino_ReservaCitas.dto;

import lombok.Data;

@Data
public class HospitalDTORequest {
    private Long idHospital;
    private String nombre;
    private String descripcion;
    private String distrito;

}
