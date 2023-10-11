/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author IngSis
 */
public class EmpleadoPorHoras extends Empleado {

    int horasTrabajadas;
    double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
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

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabajadas * this.tarifaPorHora;
    }

    @Override
    public String toString() {
        String label
                = "Nombre del Empleado que trabaja por horas: " + nombre
                + "\nSu precio por hora equivale a: " + tarifaPorHora
                + "COP\nY las horas que ha trabajado son: " + horasTrabajadas
                + "\nDando como resultado un salario de: " + calcularSalario() + "COP"
                + "\n-------------------------------------------------";
        return label;
    }

}
