/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosdelpersonal;

/**
 *
 * @author CltControl
 */
public class EmpleadoSalarioFijo extends Empleado{
    private static final double PORC1=0.05;
    private static final double PORC2=0.1;
    private static final int ANIO1=2;
    private static final int ANIO2=5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(double sueldoBasico, String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }  
    @Override
    public double getSalario(){
        return sueldoBasico + sueldoBasico*porcAdicional();
    }
    private double porcAdicional(){
        int ant=antiguedadEnAnios();
        double port=0;
        if(ant>ANIO2){
            port=PORC2;
        }
        else if(ant>= ANIO1){
            port=PORC1;
        }
        return port;
    }
}
