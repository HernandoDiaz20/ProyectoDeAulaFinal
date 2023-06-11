/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author diazg
 */
public class Venta {
    private Cliente cliente;
    private LocalDate fecha;

    // Constructor
    public Venta(Cliente cliente, LocalDate On) {
        this.cliente = cliente;
        new ArrayList<>();
    }
     

    // Métodos
    public Cliente getCliente() {
    return cliente;
}

    
     public LocalDate getFechaVenta() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
  
}
