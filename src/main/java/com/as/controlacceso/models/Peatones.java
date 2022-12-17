package com.as.controlacceso.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Peatones {
    @Id
    @Column
    private String cedula;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private String unidad;
    @Column
    private String residenteVisitante;
    @Column
    private String vehiculo;
}
