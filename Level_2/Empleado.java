package Level_2;

public class Empleado {

    String nombreYApellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado (String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora) {

        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }

    @Override
    public String toString() {
        return ("Nombre y apellido: " + this.nombreYApellido);
    }


}
