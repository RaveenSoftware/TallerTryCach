package co.edu.udes.actividadtrycatch.Actividad4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
    }
}

