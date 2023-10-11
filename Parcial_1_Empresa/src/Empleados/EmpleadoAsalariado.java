/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author IngSis
 */
public class EmpleadoAsalariado extends Empleado {

    double deducciones;

    public EmpleadoAsalariado(String nombre, double salarioBase, double deducciones) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase - deducciones;
    }

    @Override
    public String toString() {
        String etiqueta
                = "-------------------------------------------------"
                + "\nNombre del EmpleadoAsalariado: " + nombre
                + "\nCon un salario Base de: " + salarioBase
                + " COP\nY sus deducciones son de: " + deducciones
                + "COP\nEl salario total queda en: " + calcularSalario()
                + "COP\n-------------------------------------------------";
        return etiqueta;
    }
}
