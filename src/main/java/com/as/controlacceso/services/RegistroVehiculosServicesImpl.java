package com.as.controlacceso.services;

import com.as.controlacceso.models.RegistroVehiculos;
import com.as.controlacceso.repository.RegistroVehiculosRepository;

import java.util.List;

public class RegistroVehiculosServicesImpl implements RegistroVehiculosServices {

    private final RegistroVehiculosRepository registroVehiculosRepository;

    public RegistroVehiculosServicesImpl(RegistroVehiculosRepository registroVehiculosRepository) {
        this.registroVehiculosRepository = registroVehiculosRepository;
    }

    @Override
    public String createRegistroVehiculos(RegistroVehiculos registroVehiculos) {
        this.registroVehiculosRepository.save(registroVehiculos);
        return "Vehiculo Registrado Exitosamente";
    }

    @Override
    public List<RegistroVehiculos> getRegistroVehiculosByPlaca(String placa) {
        List<RegistroVehiculos> listaRegistroVehiculos = this.registroVehiculosRepository.getByPlaca(placa);
        return listaRegistroVehiculos;
    }

    @Override
    public List<RegistroVehiculos> getRegistroVehiculosByUnidad(String unidad) {
        List<RegistroVehiculos> listaRegistroVehiculos = this.registroVehiculosRepository.getByUnidad(unidad);
        return listaRegistroVehiculos;
    }
}
