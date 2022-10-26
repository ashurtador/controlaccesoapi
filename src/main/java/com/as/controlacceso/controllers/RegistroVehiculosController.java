package com.as.controlacceso.controllers;

import com.as.controlacceso.models.RegistroVehiculos;
import com.as.controlacceso.services.RegistroVehiculosServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controlacceso")
public class RegistroVehiculosController {

    private final RegistroVehiculosServices registroVehiculosServices;

    public RegistroVehiculosController(RegistroVehiculosServices registroVehiculosServices) {
        this.registroVehiculosServices = registroVehiculosServices;
    }

    @PostMapping("/crearRegistroVehiculo")
    public String createRegistroVehiculos (@RequestBody RegistroVehiculos registroVehiculos){
        return this.registroVehiculosServices.createRegistroVehiculos(registroVehiculos);
    }

    @GetMapping("/getRegistroVehiculoByPlaca/{placa}")
    public List<RegistroVehiculos> getRegistroVehiculosByPlaca(@PathVariable("placa") String placa){
        return this.registroVehiculosServices.getRegistroVehiculosByPlaca(placa);
    }

    @GetMapping("/getRegistroVehiculoByUnidad/{unidad}")
    public List<RegistroVehiculos> getRegistroVehiculosByUnidad(@PathVariable("unidad") String unidad){
        return this.registroVehiculosServices.getRegistroVehiculosByUnidad(unidad);
    }
}
