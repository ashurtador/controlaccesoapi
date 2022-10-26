package com.as.controlacceso.controllers;

import com.as.controlacceso.models.Vehiculos;
import com.as.controlacceso.services.VehiculosServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controlacceso")
public class VehiculosController {

    private final VehiculosServices vehiculosServices;

    public VehiculosController(VehiculosServices vehiculosServices) {
        this.vehiculosServices = vehiculosServices;
    }

    @PostMapping("/crearVehiculo")
    public String crearVehiculo(@RequestBody Vehiculos vehiculos){
        return this.vehiculosServices.createVehiculos(vehiculos);
    }

    @GetMapping("/getVehiculoByUnidad/{unidad}")
    public List<Vehiculos> getVehiculoByUnidad(@PathVariable("unidad") String unidad){
     return this.vehiculosServices.getVehiculoByUnidad(unidad);
    }

}
