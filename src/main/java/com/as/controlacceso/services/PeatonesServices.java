package com.as.controlacceso.services;

import com.as.controlacceso.models.Peatones;

import java.util.List;

public interface PeatonesServices {
    String createPeaton(Peatones peaton);
    Peatones getPeatonByCedula(String cedula);
    List<Peatones> getPeatonByUnidad(String unidad);
}
