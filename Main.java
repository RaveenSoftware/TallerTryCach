/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.actividadtrycatch.Actividad7;

/**
 *
 * @author JAIME BAUTISTA
 */
public class Main {

    public static void main(String[] args) {
      
        try {
            Gerente D1 = new Gerente ("Juan", 2000);
        System.out.println(D1);
        D1.incrementarSalario();
        
        
        Tecnico D2 = new Tecnico ("Jose", 15000);
        System.out.println(D2);
        D2.incrementarSalario();
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
    }
}
