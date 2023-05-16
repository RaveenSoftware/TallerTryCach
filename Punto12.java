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
public class Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Escribe un programa que solicite al usuario dos pares de
        //números: (x1, y1) y (x2, y2), que representan dos puntos en el
        //plano. Calcula la distancia entre ambos.
        
        
        Scanner lector = new Scanner(System.in);

        try {
            System.out.println("Ingrese la coordenada x del primer punto: ");
        double x1 = lector.nextDouble();

        System.out.println("Ingrese la coordenada y del primer punto: ");
        double y1 = lector.nextDouble();

        System.out.println("Ingrese la coordenada x del segundo punto: ");
        double x2 = lector.nextDouble();

        System.out.println("Ingrese la coordenada y del segundo punto: ");
        double y2 = lector.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los dos puntos es: " + distancia);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
}
