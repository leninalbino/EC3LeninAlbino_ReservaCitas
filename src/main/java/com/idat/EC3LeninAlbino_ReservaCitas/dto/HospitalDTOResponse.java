package com.idat.EC3LeninAlbino_ReservaCitas.dto;

import lombok.Data;

@Data
public class HospitalDTOResponse {
    private Long idHospital;
    private String nombre;
    private String descripcion;
    private String distrito;

}
