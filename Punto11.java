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
public class Punto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Escribe un programa que calcule la «distancia» que existe entre dos números pasados por teclado.
        
        Scanner lector = new Scanner(System.in);
        
        try {
        
        System.out.println("Ingrese el primer número: ");
        double numero1 = lector.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2 = lector.nextDouble();

        double distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia entre los números es: " + distancia);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
