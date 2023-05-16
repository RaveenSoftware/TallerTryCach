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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Escribir un programa que nos devuelva la hipotenusa de un triángulo rectángulo conociendo sus catetos
        
        double cateto1, cateto2;
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Ingrese el cateto 1: ");
        cateto1 = lector.nextDouble();
        System.out.println("Ingrese el cateto 2: ");
        cateto2 = lector.nextDouble();
        
        System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(cateto1 , 2) + Math.pow(cateto2, 2)));
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        

        
    }
    
}
