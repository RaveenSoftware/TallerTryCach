/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.actividadtrycatch.Actividad3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author JAIME BAUTISTA
 */
public class Punto16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dos vehículos viajan a diferentes velocidades y están
        //distanciados por una distancia «d». El que está detrás viaja a
        //una velocidad mayor. Se pide hacer un algoritmo para
        //ingresar la distancia entre los dos vehículos (km) y sus
        //respectivas velocidades (km/h) y con esto determinar y
        //mostrar que tiempo (minutos) alcanzará el vehículo más
        //rápido al otro.
        
        
        Scanner sc = new Scanner(System.in);

        try {
             System.out.println("Ingrese la distancia entre los dos vehículos en kilómetros: ");
        double distanciaKm = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo más lento en km/h: ");
        double velocidadLentaKmH = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo más rápido en km/h: ");
        double velocidadRapidaKmH = sc.nextDouble();

        // Convertir distancia y velocidad a unidades del SI
        double distanciaM = distanciaKm * 1000;
        double velocidadLentaMs = velocidadLentaKmH * 1000 / 3600;
        double velocidadRapidaMs = velocidadRapidaKmH * 1000 / 3600;

        // Calcular tiempo en segundos
        double tiempoSegundos = distanciaM / (velocidadRapidaMs - velocidadLentaMs);

        // Convertir tiempo a minutos y segundos
        long minutos = TimeUnit.SECONDS.toMinutes((long) tiempoSegundos);
        long segundos = (long) (tiempoSegundos - TimeUnit.MINUTES.toSeconds(minutos));

        System.out.printf("El vehículo más rápido alcanzará al otro en %d minutos y %d segundos.", minutos, segundos);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
    
    }
    
}
