package com.as.controlacceso.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroVehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false)
    private Long idRegistroVehiculos;

    @Column
    private String placa;

    @Column
    private String unidad;

    @Column
    private String time;

    public Long idRegistroVehiculos() {
        return idRegistroVehiculos;
    }

    public void idRegistroVehiculos(Long idRegistroVehiculos) {
        this.idRegistroVehiculos = idRegistroVehiculos;
    }
}
