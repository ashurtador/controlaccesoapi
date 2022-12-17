package com.as.controlacceso.services;

import com.as.controlacceso.models.RegistroVehiculos;
import com.as.controlacceso.repository.RegistroVehiculosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroVehiculosServicesImpl implements RegistroVehiculosServices {

    private final RegistroVehiculosRepository registroVehiculosRepository;

    public RegistroVehiculosServicesImpl(RegistroVehiculosRepository registroVehiculosRepository) {
        this.registroVehiculosRepository = registroVehiculosRepository;
    }

    @Override
    public String createRegistroVehiculos(RegistroVehiculos registroVehiculos) {
        registroVehiculos.setTime(LocalDateTime.now());
        this.registroVehiculosRepository.save(registroVehiculos);
        return "Vehiculo Registrado Exitosamente";
    }

    @Override
    public List<RegistroVehiculos> getRegistroVehiculosByPlaca(String placa) {
        List<RegistroVehiculos> listaRegistroVehiculos = this.registroVehiculosRepository.getByPlaca(placa);
        return listaRegistroVehiculos;
    }

    }

