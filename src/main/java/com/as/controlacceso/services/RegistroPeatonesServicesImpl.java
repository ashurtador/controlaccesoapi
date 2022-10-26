package com.as.controlacceso.services;

import com.as.controlacceso.models.RegistroPeatones;
import com.as.controlacceso.repository.RegistroPeatonesRepository;

import java.time.LocalDateTime;
import java.util.List;

public class RegistroPeatonesServicesImpl implements RegistroPeatonesServices{

    private final RegistroPeatonesRepository registroPeatonesRepository;

    public RegistroPeatonesServicesImpl(RegistroPeatonesRepository registroPeatonesRepository) {
        this.registroPeatonesRepository = registroPeatonesRepository;
    }

    @Override
    public String createRegistroPeaton(RegistroPeatones registroPeatones) {
        registroPeatones.setTime(LocalDateTime.now());
        this.registroPeatonesRepository.save(registroPeatones);
        return "Peaton Registrado Exitosamente";
    }

    @Override
    public List<RegistroPeatones> getRegistroPeatonesByCedula(String cedula) {

        List<RegistroPeatones> listaRegistroPeatones =this.registroPeatonesRepository.getByCedula(cedula);

        return listaRegistroPeatones;
    }

    @Override
    public List<RegistroPeatones> getRegistroPeatonesByUnidad(String unidad) {

        List<RegistroPeatones> listaRegistroPeatones =this.registroPeatonesRepository.getByUnidad(unidad);

        return listaRegistroPeatones;
    }


}
