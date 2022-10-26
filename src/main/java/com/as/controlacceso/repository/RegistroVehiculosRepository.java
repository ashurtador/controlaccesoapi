package com.as.controlacceso.repository;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.models.RegistroPeatones;
import com.as.controlacceso.models.RegistroVehiculos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroVehiculosRepository extends JpaRepository<RegistroVehiculos,String> {

    List<RegistroVehiculos> getByPlaca(String placa);

    List<RegistroVehiculos> getByUnidad(String unidad);
}
