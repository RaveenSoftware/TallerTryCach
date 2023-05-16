/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class FusionDeVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        try {
             // Pedir al usuario el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = input.nextInt();

        // Pedir al usuario los elementos del primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        int[] vector1 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = input.nextInt();
        }

        // Pedir al usuario los elementos del segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector2[i] = input.nextInt();
        }

        // Fusionar ambos vectores en un tercer vector ordenado
        int[] vectorFusionado = new int[2 * n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < n) {
            if (vector1[i] < vector2[j]) {
                vectorFusionado[k++] = vector1[i++];
            } else {
                vectorFusionado[k++] = vector2[j++];
            }
        }

        while (i < n) {
            vectorFusionado[k++] = vector1[i++];
        }

        while (j < n) {
            vectorFusionado[k++] = vector2[j++];
        }

        // Mostrar el tercer vector ordenado
        
        System.out.println("El tercer vector ordenado es:");
        for (int l = 0; l < 2 * n; l++) {
            Arrays.sort(vectorFusionado);
            System.out.print(vectorFusionado[l] + " ");
        }
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
    }
}
