/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosdelpersonal;

import java.time.LocalDate;

/**
 *
 * @author CltControl
 */
public abstract class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }   
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
    public abstract double getSalario();
    
    public int antiguedadEnAnios(){
        int anioActual=LocalDate.now().getYear();
        return anioActual-anioIngreso;
    }
}
