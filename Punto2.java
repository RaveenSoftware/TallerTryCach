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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que calcule el perímetro y área de un rectángulo dada su base y su altura
        
        double base;
        double altura;
        double resultado;
        Scanner lector = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese la base:  ");
        base = lector.nextDouble();
    
        System.out.println("Ingrese la altura:  ");
        altura = lector.nextDouble();
        
        resultado = base*altura;
        
        System.out.println("El perimetro es: " + resultado);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
    }
    
}
