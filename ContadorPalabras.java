/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad5;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class ContadorPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        try {
             // Pedir al usuario que ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();

        // Contar el número de palabras de la frase
        int numPalabras = 0;
        boolean esPalabra = false;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                esPalabra = true;
            } else if (esPalabra) {
                numPalabras++;
                esPalabra = false;
            }
        }

        if (esPalabra) {
            numPalabras++;
        }

        // Mostrar el número de palabras de la frase
        System.out.println("La frase tiene " + numPalabras + " palabras.");
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    }
}







