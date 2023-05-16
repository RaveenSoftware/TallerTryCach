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
public class Punto17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Un ciclista parte de una ciudad A a las HH horas, MM minutos
//y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B
//es de T segundos. Escribir un algoritmo que determine la hora
//de llegada a la ciudad B.


        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Introduce la hora de partida (HH MM SS): ");
        int hh = input.nextInt();
        int mm = input.nextInt();
        int ss = input.nextInt();

        System.out.println("Introduce el tiempo de viaje en segundos: ");
        int t = input.nextInt();

        // Convertir la hora de partida a segundos
        int partidaEnSegundos = hh * 3600 + mm * 60 + ss;

        // Calcular la hora de llegada en segundos
        int llegadaEnSegundos = partidaEnSegundos + t;

        // Convertir la hora de llegada a horas, minutos y segundos
        int hora = llegadaEnSegundos / 3600;
        int minutos = (llegadaEnSegundos % 3600) / 60;
        int segundos = llegadaEnSegundos % 60;
        
        System.out.printf("El ciclista llegará a las %02d:%02d:%02d", hora, minutos, segundos);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }

        
        
        
    }

}
