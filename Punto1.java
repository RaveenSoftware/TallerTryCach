/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.actividadtrycatch.Actividad3;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Escribir un programa que pregunte al usuario su nombre, y luego lo salude
        
        Scanner lector = new Scanner(System.in);
        
        try {
        String nombre;
        System.out.println("Ingrese un nombre");
        nombre = lector.nextLine();
        
        System.out.println("Hola " + nombre + "Bienvenido");
        } catch (Exception e) {
            System.out.println("Desde del catch");
            System.out.println(e.getMessage());
        }
    
    }
    
}
