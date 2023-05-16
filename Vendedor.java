/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.actividadtrycatch.Actividad6;



/**
 *
 * @author JAIME BAUTISTA
 */
import java.util.ArrayList;

public class Vendedor extends Empleado {
    private Coche coche;
    private String areaVenta;
    public ArrayList<Cliente> listaClientes;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Coche coche, String areaVenta, double porcentajeComision) {
        
        this.coche = coche;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<Cliente>();
        this.porcentajeComision = porcentajeComision;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public void darAltaCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void darBajaCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void incrementarSalario() {
        double incremento = getSalario() * 0.1;
        setSalario(getSalario() + incremento);
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += ", Coche: " + coche.toString() + ", Área de venta: " + areaVenta + ", Porcentaje comisión: " + porcentajeComision;
        return cadena;
    }

    private double getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSalario(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    
    // getters y setters para los atributos del coche
    
    // otros métodos como dar de alta/baja un cliente, cambiar coche, etc.

