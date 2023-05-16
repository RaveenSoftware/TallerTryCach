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
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribe un programa que reciba un número y calcule su raíz cuadrada y cúbica.
        
        
        Scanner lector = new Scanner(System.in);
        
        try {
        
        System.out.println("Ingrese un número: ");
        double numero = lector.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es " + raizCubica);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        

    }
    
}
