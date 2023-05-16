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
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto
        //dinero obtendrá por concepto de comisiones por las tres
        //ventas que realiza en el mes y el total que recibirá en el mes,
        //tomando en cuenta su sueldo base y comisiones.
        
        double base,venta1,venta2,venta3,comision;
        Scanner entrada = new Scanner(System.in);
        
        try {
            System.out.println("base:");
        base=entrada.nextDouble();
        System.out.println("venta1:");
        venta1=entrada.nextDouble();
        System.out.println("venta2:");
        venta2=entrada.nextDouble();
        System.out.println("venta3:");
        venta3=entrada.nextDouble();
        
        comision=(venta1+venta2+venta3);
        System.out.println(comision*0.1);
        } catch (Exception e) {
            System.out.println("Desde el catch");
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        
    }
    
}
