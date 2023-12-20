/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosdelpersonal;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados=new ArrayList<>();
    }   
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
    public void mostrarSalarios(){
        for(Empleado e:empleados){
            System.out.println(e.nombreCompleto()+". Salario: "+e.getSalario());
        }
    }
    public Empleado empleadoConMasClientes(){
        int max=-1;
        Empleado elMayor=null;
        for(Empleado e:empleados){
            if(e instanceof EmpleadoAComision){
                EmpleadoAComision eac=(EmpleadoAComision) e;
                if(eac.getCantClientesCaptados()>max){
                    max=eac.getCantClientesCaptados();
                    elMayor=eac;
                }
            }
        }
        return elMayor;
    }
}
