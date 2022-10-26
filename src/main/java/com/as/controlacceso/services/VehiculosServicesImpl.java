package com.as.controlacceso.services;

import com.as.controlacceso.models.Vehiculos;
import com.as.controlacceso.repository.VehiculosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculosServicesImpl implements VehiculosServices{

    private final VehiculosRepository vehiculosRepository;

    public VehiculosServicesImpl(VehiculosRepository vehiculosRepository) {
        this.vehiculosRepository = vehiculosRepository;
    }

    @Override
    public String createVehiculos(Vehiculos vehiculos) {
        this.vehiculosRepository.save(vehiculos);
        return "Vehiculo Ingresado Correctamente";
    }

    @Override
    public List<Vehiculos> getVehiculoByUnidad(String unidad) {

        List<Vehiculos> listaVehiculos = this.vehiculosRepository.getByUnidad(unidad);
        return listaVehiculos;
    }
}
