/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad7;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Tecnico extends Operario{

    public Tecnico() {
    }

    public Tecnico(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public String toString() {
        return this.getNombre()+"TECNICO"+super.toString();
    }

  //Metodo 
    
    public void incrementarSalario(){
        
        double incremento = this.getSalario() * 0.40;
        this.setSalario(this.getSalario()+incremento);
    }
    
    
}
