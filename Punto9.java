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
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá pagar finalmente por su pedido
        
        double totalcompra, descuentoAplicado;
        Scanner lector = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el total del precio para aplicar el descuento del 15%: ");
        totalcompra = lector.nextDouble();
        
        
        descuentoAplicado = (totalcompra * 0.15);
        System.out.println("El precio con el descuento aplicado es: " + descuentoAplicado);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
