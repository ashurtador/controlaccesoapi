package com.as.controlacceso.repository;

import com.as.controlacceso.models.Peatones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeatonesRepository extends JpaRepository<Peatones,String> {

    Peatones getByCedula(String cedula);

    List<Peatones> getByUnidad(String unidad);
}
