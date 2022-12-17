package com.as.controlacceso.controllers;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.services.PeatonesServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controlacceso")
@CrossOrigin(origins = "*")
public class PeatonesController {
    private final PeatonesServices peatonesServices;
    public PeatonesController(PeatonesServices peatonesServices) {
        this.peatonesServices = peatonesServices;
    }
    @PostMapping("/crearPeaton")
    public String crearPeaton(@RequestBody Peatones peaton){
        return this.peatonesServices.createPeaton(peaton);
    }
    @GetMapping("/getPeatonByCedula/{cedula}")
    public Peatones getPeatonByCedula(@PathVariable("cedula") String cedula){
        return this.peatonesServices.getPeatonByCedula(cedula);
    }
    @GetMapping("/getPeatonByUnidad/{unidad}")
    public List<Peatones> getPeatonByUnidad(@PathVariable("unidad") String unidad){
        return  this.peatonesServices.getPeatonByUnidad(unidad);
    }
}

