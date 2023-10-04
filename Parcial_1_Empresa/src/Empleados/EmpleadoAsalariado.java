package Empleados;

public abstract class EmpleadoAsalariado extends Empleado {

    private double deducciones;
    private double salarioFijo;
    private double SalarioRecibido;

    public EmpleadoAsalariado(double deducciones, double salarioFijo, double SalarioRecibido, double SalarioBase, String nombre) {
        super(SalarioBase, nombre);
        this.deducciones = deducciones;
        this.salarioFijo = salarioFijo;
        this.SalarioRecibido = SalarioRecibido;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioRecibido() {
        return SalarioRecibido;
    }

    public void setSalarioRecibido(double SalarioRecibido) {
        this.SalarioRecibido = SalarioRecibido;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSalario(double salarioFijo, double deducciones) {
        salarioFijo= 1000000;
        deducciones= 100000;
        return SalarioRecibido = salarioFijo - deducciones;
        
    }

}
