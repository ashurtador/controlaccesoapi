package com.as.controlacceso.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroPeatones {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false)
    private Long idRegistroPeatones;

    @Column
    private String cedula;

    @Column
    private String unidad;

    @Column
    private String time;

    public Long idRegistroPeatones() {
        return idRegistroPeatones;
    }

    public void idRegistroPeatones(Long idRegistroPeatones) {
        this.idRegistroPeatones = idRegistroPeatones;
    }
}
