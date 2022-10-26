package com.as.controlacceso.services;

import com.as.controlacceso.models.RegistroPeatones;
import com.as.controlacceso.models.RegistroVehiculos;

import java.util.List;

public interface RegistroVehiculosServices {

    String createRegistroVehiculos(RegistroVehiculos registroVehiculos);

    List<RegistroVehiculos> getRegistroVehiculosByPlaca(String placa);

    List<RegistroVehiculos> getRegistroVehiculosByUnidad(String unidad);
}
