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
public class Punto6 {
    static int n;
    static double media;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribe un programa que calcule la media de tres números introducidos por teclado.
   
        Scanner lector = new Scanner(System.in);
        
        try {
            System.out.println("Cantidad de numero a calcular: ");
        n = lector.nextInt();
 
        // array donde se van a almacenar los numeros
        double numeros [] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero: ");
            numeros[i] = lector.nextDouble();
        }
        
        {
            double suma = 0;
            for (double i: numeros)
            {
                suma = suma +i;
                
            }
            
            media = suma / n;
            System.out.println("La media es: " + media);
            
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
