package com.as.controlacceso.repository;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.models.RegistroPeatones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroPeatonesRepository extends JpaRepository<RegistroPeatones,String> {

    List<RegistroPeatones> getByCedula(String cedula);


}
