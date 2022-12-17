package com.as.controlacceso.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculos {

    @Id
    @Column
    private String placa;

    @Column
    private String unidad;

    @Column
    private String residenteVisitante;

}
