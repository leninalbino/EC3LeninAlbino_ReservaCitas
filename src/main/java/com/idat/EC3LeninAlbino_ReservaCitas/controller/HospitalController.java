package com.idat.EC3LeninAlbino_ReservaCitas.controller;

import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.ClienteDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTORequest;
import com.idat.EC3LeninAlbino_ReservaCitas.dto.HospitalDTOResponse;
import com.idat.EC3LeninAlbino_ReservaCitas.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospital/v1")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/guardar")
    public @ResponseBody void guardarHospital(@RequestBody HospitalDTORequest hospitalDTORequest){
        hospitalService.guardarHospital(hospitalDTORequest);
    }
    @PutMapping("/actualizar")
    public @ResponseBody void actualizarHospital(@RequestBody HospitalDTORequest hospitalDTORequest){
        hospitalService.actualizarHospital(hospitalDTORequest);
    }
    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminarHospital(@PathVariable("id") Long id){
        hospitalService.eliminarHospital(id);
    }
    @GetMapping("/listar")
    public @ResponseBody List<HospitalDTOResponse> listarHospital(){
        return hospitalService.listarHospital();
    }
    @GetMapping("/listar/{id}")
    public  @ResponseBody HospitalDTOResponse listarPorId(@PathVariable("id") Long id){
        return hospitalService.obtenerHospitalId(id);
    }

}
