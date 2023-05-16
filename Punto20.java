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
public class Punto20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Realiza un programa que nos diga el dinero que tenemos (en
        //euros y céntimos) tras preguntarnos cuantas monedas
        //tenemos de 2 euros, 1 euro, 50, 20 ó 10 céntimos.
        
         Scanner lector = new Scanner(System.in);

        try {
             System.out.println("Introduce el número de monedas de 2 euros: ");
        int num2Euros = lector.nextInt();

        System.out.println("Introduce el número de monedas de 1 euro: ");
        int num1Euro = lector.nextInt();

        System.out.println("Introduce el número de monedas de 50 centimos: ");
        int num50Cent = lector.nextInt();

        System.out.println("Introduce el número de monedas de 20 centimos: ");
        int num20Cent = lector.nextInt();

        System.out.println("Introduce el número de monedas de 10 centimos: ");
        int num10Cent = lector.nextInt();

        int dineroEnCentimos = num2Euros * 200 + num1Euro * 100 + num50Cent * 50 + num20Cent * 20 + num10Cent * 10;
        int euros = dineroEnCentimos / 100;
        int centimos = dineroEnCentimos % 100;

        System.out.println("Tienes " + euros + " euros y " + centimos + " centimos.");
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    
    }
    
}
