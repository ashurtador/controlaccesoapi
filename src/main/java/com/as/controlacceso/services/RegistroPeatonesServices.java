package com.as.controlacceso.services;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.models.RegistroPeatones;

import java.util.List;

public interface RegistroPeatonesServices {

    String createRegistroPeaton(RegistroPeatones registroPeatones);

    List<RegistroPeatones> getRegistroPeatonesByCedula(String cedula);

}
