/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author IngSis
 */
public abstract class Empleado {
    private double SalarioBase;
    String nombre;
  
    public Empleado(double SalarioBase, String nombre) {
        this.SalarioBase = SalarioBase;
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
       
    public abstract double calcularSalario();
}
