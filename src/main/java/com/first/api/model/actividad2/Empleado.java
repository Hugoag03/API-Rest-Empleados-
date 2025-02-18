package com.first.api.model.actividad2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    private String email;
    private int anosExperiencia;
    private int telefono;
}
