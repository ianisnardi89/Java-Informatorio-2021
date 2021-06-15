package EjerciciosPropuestos;

import java.time.LocalDate;

public class Empleado {
    
    String nombre;
    String apellido;
    LocalDate fechaDeNacimiento;
    Double sueldo;

    public Empleado (String nombre, String apellido, LocalDate fechaDeNacimiento, Double sueldo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldo = sueldo;

    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + "edad: " + getEdad() + " " + "sueldo: " + getSueldo();
    }

    public int getEdad () {
        int edad = LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
        return edad;
    }

    public double getSueldo () {
        Double sueldo = this.sueldo;
        return sueldo;
    }

}
