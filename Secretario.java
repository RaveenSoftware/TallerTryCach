/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad6;



/**
 *
 * @author JAIME BAUTISTA
 */
public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, String nombre, String apellido, int DNI, String direccion, String anos_de_antiguedad, int telefono, String supervisor) {
        super(nombre, apellido, DNI, direccion, anos_de_antiguedad, telefono, supervisor);
        this.despacho = despacho;
        this.fax = fax;
    }
    
    
    
    public void incrementarSalario(double salarioActual) {
    double incremento = salarioActual * 0.1;
    double salarioNuevo = salarioActual + incremento;
   
}

    
    public String toString() {
        return super.toString() + "\n" +
               "Puesto en la empresa: Secretario\n" +
               "Despacho: " + despacho + "\n" +
               "Fax: " + fax;
    }
}
