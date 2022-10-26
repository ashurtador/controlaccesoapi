package com.as.controlacceso.repository;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.models.Vehiculos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiculosRepository extends JpaRepository<Vehiculos, String> {

    List<Vehiculos> getByUnidad(String unidad);
}
