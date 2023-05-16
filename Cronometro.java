/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad4;
/**
 *
 * @author usuario
 */
import java.util.concurrent.TimeUnit;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {
       
        try {
             int horas = 0, minutos = 0, segundos = 0;

        while (true) {
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            TimeUnit.SECONDS.sleep(1);
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
            }
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    }
}

