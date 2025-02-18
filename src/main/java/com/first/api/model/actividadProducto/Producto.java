package com.first.api.model.actividadProducto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double precio;
}
