/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author JAIME BAUTISTA
 */
public class Punto19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realiza un programa que calcule la nota final de un
        //estudiante, considerando por cada respuesta 5 puntos, las
        //incorrectas restan un punto, y las no contestadas ni suman ni
        //restan.
        
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Introduce el número total de preguntas: ");
        int totalPreguntas = input.nextInt();

        System.out.println("Introduce el número de respuestas correctas: ");
        int respuestasCorrectas = input.nextInt();

        System.out.println("Introduce el número de respuestas incorrectas: ");
        int respuestasIncorrectas = input.nextInt();

        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;

        notaFinal = Math.max(notaFinal, 0);
        System.out.println("Tu nota final es: " + notaFinal);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
       
    }
    
}
