package com.as.controlacceso.controllers;

import com.as.controlacceso.models.RegistroPeatones;
import com.as.controlacceso.services.RegistroPeatonesServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controlacceso")
public class RegistroPeatonesController {

    private final RegistroPeatonesServices registroPeatonesServices;

    public RegistroPeatonesController(RegistroPeatonesServices registroPeatonesServices) {
        this.registroPeatonesServices = registroPeatonesServices;
    }

    @PostMapping("/crearRegistroPeaton")
    public String createRegistroPeaton(@RequestBody RegistroPeatones registroPeatones){
        return this.registroPeatonesServices.createRegistroPeaton(registroPeatones);
    }

    @GetMapping("/getRegistroPeatonByCedula/{cedula}")
    public List<RegistroPeatones> getRegistroPeatonesByCedula(@PathVariable("cedula") String cedula){
        return this.registroPeatonesServices.getRegistroPeatonesByCedula(cedula);
    }

    @GetMapping("/getRegistroPeatonByUnidad/{unidad}")
    public List<RegistroPeatones> getRegistroPeatonesByUnidad(@PathVariable("unidad") String unidad){
        return this.registroPeatonesServices.getRegistroPeatonesByUnidad(unidad);
    }
}
