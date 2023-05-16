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
public class Punto15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribe un programa que reciba dos variables numéricas (A y
        //B) y realiza un algoritmo que intercambie los valores de
        //ambas y muestre cuánto valen al final cada una.
        
        Scanner lector = new Scanner(System.in);

        try {
        
        System.out.println("Ingrese el valor de A: ");
        int a = lector.nextInt();

        System.out.println("Ingrese el valor de B: ");
        int b = lector.nextInt();

        // Intercambio de valores utilizando una variable auxiliar
        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
      
    }
    
}
