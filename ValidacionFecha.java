/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad5;

import java.util.Scanner;



/**
 *
 * @author JAIME BAUTISTA
 */
public class ValidacionFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        try {
            int dia, mes, anio;
        
        System.out.print("Ingrese el día: ");
        dia = sc.nextInt();
        
        System.out.print("Ingrese el mes: ");
        mes = sc.nextInt();
        
        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();
        
        if(esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
        }
    }
    
    public static boolean esFechaValida(int dia, int mes, int anio) {
        try {
            // meses con 31 días
        int[] diasMes31 = {1, 3, 5, 7, 8, 10, 12};
        // meses con 30 días
        int[] diasMes30 = {4, 6, 9, 11};
        
        // verifica que el año sea mayor a 0
        if(anio <= 0) {
            return false;
        }
        
        // verifica que el mes esté en el rango válido
        if(mes < 1 || mes > 12) {
            return false;
        }
        
        // verifica si el día es válido según el mes
        if(contains(diasMes31, mes)) {
            if(dia < 1 || dia > 31) {
                return false;
            }
        } else if(contains(diasMes30, mes)) {
            if(dia < 1 || dia > 30) {
                return false;
            }
        } else {
            // febrero
            if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                // año bisiesto
                if(dia < 1 || dia > 29) {
                    return false;
                }
            } else {
                // no es año bisiesto
                if(dia < 1 || dia > 28) {
                    return false;
                }
            }
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        // si todas las condiciones se cumplen, entonces la fecha es válida
        return true;
    }
    
    public static boolean contains(int[] array, int key) {
        try {
            for(int i : array) {
            if(i == key) {
                return true;
            }
        }
        } catch (Exception e) {
            System.out.println("Desde el catch ");
            System.out.println(e.getMessage());
        }
        return false;
    }
}
