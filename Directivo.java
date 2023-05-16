/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad7;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Directivo extends Empleado {
    
    

    public Directivo() {
    }

    public Directivo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public String toString() {
        return "DIRECTIVO"+super.toString();
    }
    
    
    
      //Metodo 
    
    public void incrementarSalario(){
        
        double incremento = this.getSalario() * 0.40;
        this.setSalario(this.getSalario()+incremento);
    }
    
    

}
