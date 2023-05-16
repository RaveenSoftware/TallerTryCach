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
public class Punto18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribe un programa que pida el nombre y los dos apellidos de una persona y después muestre las iniciales.
        
        Scanner input = new Scanner(System.in);

        try {
             System.out.println("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Introduce tu primer apellido: ");
        String apellido1 = input.nextLine();

        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = input.nextLine();

        String iniciales = Character.toString(nombre.charAt(0)) + Character.toString(apellido1.charAt(0)) + Character.toString(apellido2.charAt(0));

        System.out.println("Tus iniciales son: " + iniciales);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
    }
    
}
