/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.actividadtrycatch.Actividad2;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese una palabra para invertirla:");

        
        Scanner lector = new Scanner(System.in);
       
        try {
             String cadena = lector.nextLine();

       
        String cadenaInvertida = "";

        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

   
        System.out.println(cadenaInvertida);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
    }
    
}
