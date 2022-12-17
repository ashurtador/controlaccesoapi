package com.as.controlacceso.services;

import com.as.controlacceso.models.Peatones;
import com.as.controlacceso.repository.PeatonesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeatonesServicesImpl implements PeatonesServices{
    private final PeatonesRepository peatonesRepository;
    public PeatonesServicesImpl(PeatonesRepository peatonesRepository) {
        this.peatonesRepository = peatonesRepository;
    }
    @Override
    public String createPeaton(Peatones peaton) {
        this.peatonesRepository.save(peaton);
        return "Peaton Ingresado Correctamente";
    }
    @Override
    public Peatones getPeatonByCedula(String cedula) {
        Peatones peaton = this.peatonesRepository.getByCedula(cedula);
        return peaton;
    }
    @Override
    public List<Peatones> getPeatonByUnidad(String unidad) {
        List<Peatones> listaPeatones = this.peatonesRepository.getByUnidad(unidad);
        return listaPeatones;
    }
}
