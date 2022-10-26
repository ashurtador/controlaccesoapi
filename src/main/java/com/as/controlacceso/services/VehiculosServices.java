package com.as.controlacceso.services;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.models.Vehiculos;

import java.util.List;

public interface VehiculosServices {

    String createVehiculos(Vehiculos vehiculos);

    List<Vehiculos> getVehiculoByUnidad(String unidad);
}
