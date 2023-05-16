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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realiza un programa que dados dos números, muestre la suma, resta , división y multiplicación de ambos.
        
        int numeroA;
        int numeroB;
        
        int suma;
        int resta;
        int multi;
        int divi;
        
        
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Ingrese un numero: ");
        numeroA = lector.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        numeroB = lector.nextInt();
        
        //Operaciones
        
        suma = numeroA + numeroB;
        resta = numeroA - numeroB;
        multi = numeroA * numeroB;
        divi = numeroA / numeroB;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La restae es: " + resta);
        System.out.println("La multiplicacion es: "  + multi);
        System.out.println("La division es: " + divi);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    }
    
}
