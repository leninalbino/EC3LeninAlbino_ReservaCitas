package com.idat.EC3LeninAlbino_ReservaCitas.service;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTOResponse;

import java.util.List;

public interface HospitalService {
    void guardarHospital(HospitalDTORequest hospital);
    void actualizarHospital(HospitalDTORequest hospital);

    void eliminarHospital(Long id);

    List<HospitalDTOResponse> listarHospital();
    HospitalDTOResponse obtenerHospitalId(Long id);
}
