/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad6;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Cliente {
    
    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private boolean activo;
    
    // Constructor
    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.activo = true;
    }
    
    // Métodos
    
    // Cambiar estado del cliente a activo
    public void darDeAlta() {
        this.activo = true;
    }
    
    // Cambiar estado del cliente a inactivo
    public void darDeBaja() {
        this.activo = false;
    }
    
    // Obtener el estado del cliente
    public boolean estaActivo() {
        return activo;
    }
    
    // Imprimir los datos del cliente
    @Override
    public String toString() {
        String estado = activo ? "Activo" : "Inactivo";
        return "Nombre: " + nombre + " " + apellidos + "\n"
                + "DNI: " + dni + "\n"
                + "Dirección: " + direccion + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Estado: " + estado + "\n";
    }
}

