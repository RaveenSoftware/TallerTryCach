/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad6;

import java.util.ArrayList;

/**
 *
 * @author JAIME BAUTISTA
 */
public class JefeZona extends Empleado {

    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private Coche Coche;
    // otros atributos y métodos

    public JefeZona() {
    }

    public JefeZona( Coche Coche, String nombre, String apellido, int DNI, String direccion, String anos_de_antiguedad, int telefono, String supervisor) {
        super(nombre, apellido, DNI, direccion, anos_de_antiguedad, telefono, supervisor);
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.Coche = Coche;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
