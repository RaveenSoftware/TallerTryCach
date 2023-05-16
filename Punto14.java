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
public class Punto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribe un programa que reciba un número de dos cifras y muestre por pantalla el número invertido
        
        Scanner lector = new Scanner(System.in);

        try {
        
        System.out.println("Ingrese un número de dos cifras: ");
        int numero = lector.nextInt();

        int decenas = numero / 10;
        int unidades = numero % 10;
        int numeroInvertido = unidades * 10 + decenas;

        System.out.println("El número invertido es: " + numeroInvertido);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
}
