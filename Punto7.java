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
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crea un programa que reciba por teclado una cantidad de minutos y te devuelva la conversión en horas y minutos equivalentes.
        
        
        Scanner lector =new Scanner(System.in);  
        
        try {
            int segundos, minutos, horas;
        
        System.out.println("Mostrar la cantidad en horas y minutos");    
        System.out.println("Ingrese una cantidad en segundos : ");
        segundos = Integer.parseInt(lector.next());
        horas = segundos/3600;
        minutos = segundos/60;
        System.out.println("En horas : " + horas);
        System.out.println("En minutos : " + minutos);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    }
    
}
