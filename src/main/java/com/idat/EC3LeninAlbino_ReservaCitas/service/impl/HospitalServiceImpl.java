package com.idat.EC3LeninAlbino_ReservaCitas.service.impl;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.entity.Hospital;
import com.idat.EC3LeninAlbino_ReservaCitas.repository.HospitalRepository;
import com.idat.EC3LeninAlbino_ReservaCitas.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public void guardarHospital(HospitalDTORequest hospital) {
        Hospital h = new Hospital();
        h.setNombre(hospital.getNombre());
        h.setDescripcion(hospital.getDescripcion());
        h.setDistrito(hospital.getDistrito());
        hospitalRepository.save(h);
    }

    @Override
    public void actualizarHospital(HospitalDTORequest hospital) {
        Hospital h = new Hospital();
        h.setNombre(hospital.getNombre());
        h.setDescripcion(hospital.getDescripcion());
        h.setDistrito(hospital.getDistrito());
        hospitalRepository.saveAndFlush(h);
    }

    @Override
    public void eliminarHospital(Long id) {
        hospitalRepository.deleteById(id);
    }

    @Override
    public List<HospitalDTOResponse> listarHospital() {
        List<HospitalDTOResponse>list=new ArrayList<>();
        HospitalDTOResponse dto = null;
        List<Hospital> h = hospitalRepository.findAll();
        for (Hospital hospital:h){
            dto= new HospitalDTOResponse();
            dto.setNombre(hospital.getNombre());
            dto.setDescripcion(hospital.getDescripcion());
            dto.setDistrito(hospital.getDistrito());
            dto.setIdHospital(hospital.getIdHospital());
            list.add(dto);
        }
        return list;
    }

    @Override
    public HospitalDTOResponse obtenerHospitalId(Long id) {
        Hospital hospital = hospitalRepository.findById(id).orElse(null);
        HospitalDTOResponse dto = new HospitalDTOResponse();
        dto.setNombre(hospital.getNombre());
        dto.setDescripcion(hospital.getDescripcion());
        dto.setDistrito(hospital.getDistrito());
        dto.setIdHospital(hospital.getIdHospital());
        return dto;
    }
}
