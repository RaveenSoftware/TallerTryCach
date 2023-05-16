/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad7;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Empleado {
    private String nombre;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        
       return "Empleado";
    }
    
    
    //Metodos 
    
    public void incrementarSalario(){
        
        double incremento  = salario*0.60;
        salario = salario + incremento;
    }
  
}
