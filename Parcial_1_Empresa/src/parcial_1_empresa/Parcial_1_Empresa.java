/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial.pkg1;

import Empleados.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < empleados.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Nombre ");
                String nombre = entrada.next();
                System.out.println("salarioBase ");
                double salarioBase = entrada.nextDouble();
                System.out.println("deducciones ");
                double deducciones = entrada.nextDouble();
                empleados[i] = new EmpleadoAsalariado(nombre, salarioBase, deducciones);
            } else {
                System.out.println("Nombre ");
                String nombre = entrada.next();
                System.out.println("salarioBase ");
                double salarioBase = entrada.nextDouble();
                System.out.println("horasTrabajadas ");
                int horasTrabajadas = entrada.nextInt();
                System.out.println("tarifaPorHora ");
                double tarifaPorHora = entrada.nextDouble();
                empleados[i] = new EmpleadoPorHoras(nombre, salarioBase, horasTrabajadas, tarifaPorHora);
            }
        }
        for (Empleado i : empleados) {
            System.out.println(i);
        }
        int posicion = 0;
        System.out.println("Modificar empleado");
        posicion = encontrarEmpleadoPorNombre(empleados);
        if (posicion != -1) {
            if (empleados[posicion].getClass().equals(EmpleadoPorHoras.class)) {

                EmpleadoPorHoras empleado = (EmpleadoPorHoras) empleados[posicion];

                System.out.println("Cambiar el nombre");
                empleado.setNombre(entrada.nextLine());

                System.out.println("Dime las horas trabajadas (Entero positivo)");
                empleado.setHorasTrabajadas(entrada.nextInt());

                System.out.println("Dime las horas TarifaPorHora (Double positivo)");
                empleado.setTarifaPorHora(entrada.nextDouble());
            } else {
                EmpleadoAsalariado empleado = (EmpleadoAsalariado) empleados[posicion];
                System.out.println("Cambiar el nombre");
                empleado.setNombre(entrada.nextLine());

                System.out.println("Cambiar salario base");
                empleado.setSalarioBase(entrada.nextDouble());

                System.out.println("Cambiar deducciones");
                empleado.setDeducciones(entrada.nextDouble());

            }
        }

        for (Empleado i : empleados) {
            if (i.getClass().equals(EmpleadoPorHoras.class)) {
                System.out.println(i);
            }
        }
        posicion = encontrarEmpleadoPorNombre(empleados);
        if (posicion != -1) {
            System.out.println(empleados[posicion]);
        }
    }

    private static int encontrarEmpleadoPorNombre(Empleado[] empleados) {
        System.out.println("Dime el nombre del empleado");
        String nombre = new Scanner(System.in).nextLine();
        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        System.out.println("No se encontro el empleado con ese nombre");
        return -1;
    }

}
