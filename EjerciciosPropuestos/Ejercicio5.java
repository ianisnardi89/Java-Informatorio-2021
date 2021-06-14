package EjerciciosPropuestos;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filepath = "EjerciciosPropuestos\\empleados.txt";
        File file = new File(filepath);
        String path = file.getAbsolutePath();

        ArrayList<Empleado> empleados = leerArchivo(path);

        System.out.println("Ingrese una letra para filtrar por apellido");
        String letra = scan.nextLine();
        Empleado[] empleadosFiltrados = empleadosFiltradosPorLetra(letra, empleados);
        System.out.println("Los empleados que empiezan con " + letra + " son: ");
        for (int i = 0; i < empleadosFiltrados.length; i++) {
            if (empleadosFiltrados[i] != null ) {
                System.out.println(empleadosFiltrados[i]);
            }
        }
        System.out.println();

        Empleado[] jovenYViejo = obtenerJovenYViejo(empleados);
        System.out.println("El empleados mas joven es: " + jovenYViejo[0]);
        System.out.println("El empleado mas viejo es: " + jovenYViejo[1]);
        System.out.println();

        Empleado[] pobreYRico = peorYMejorSueldo(empleados);
        System.out.println("El empleado que menos gana es: " + pobreYRico[0]);
        System.out.println("El empleado que mas gana es: " + pobreYRico[1]);
        System.out.println();
        scan.close();
    }
    public static Empleado[] peorYMejorSueldo (ArrayList<Empleado> empleados) {
        Empleado[] pobreYRico = new Empleado[2];
        Empleado pobre = empleados.get(0), rico = empleados.get(0);
        for (int i = 0; i<empleados.size(); i++ ) {
            if (empleados.get(i).sueldo > rico.sueldo ) {
                rico = empleados.get(i);
            }
            if ( empleados.get(i).sueldo < pobre.sueldo ) {
                pobre = empleados.get(i);
            }
        }
        pobreYRico[0] = pobre;
        pobreYRico[1] = rico;
        return pobreYRico;

    }

    public static Empleado[] obtenerJovenYViejo (ArrayList<Empleado> empleados) {
        Empleado[] jovenYViejo = new Empleado[2];
        Empleado joven = empleados.get(0), viejo = empleados.get(0);
        for (int i = 0; i < empleados.size(); i++){
            if ( empleados.get(i).getEdad() > viejo.getEdad()) {
                viejo = empleados.get(i);
            }
            if ( empleados.get(i).getEdad() < joven.getEdad()) {
                joven = empleados.get(i);
            }
        }
        jovenYViejo[1] = viejo;
        jovenYViejo[0] = joven;

        return jovenYViejo;
    }

    public static ArrayList<Empleado> leerArchivo (String filename ) {
        String line = null;
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            FileReader r = new FileReader(filename);
            BufferedReader br = new BufferedReader(r);

            while ((line = br.readLine()) != null) {
                Empleado e = crearEmpleado(line);
                empleados.add(e);
            }
            br.close();
        

        
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (Error e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return empleados;
    
    }

    public static Empleado crearEmpleado (String empleadoString ) {
        String[] campos = empleadoString.split(",");

        String nombre = campos[0];
        String apellido = campos[1];
        LocalDate fechaNacimiento = parseFecha(campos[2]);
        double sueldo = parseSueldo(campos[3]);

        Empleado e = new Empleado(nombre, apellido, fechaNacimiento, sueldo);
        return e;
    }

    public static double parseSueldo (String sueldoString) { 
        return Double.parseDouble(sueldoString);
    }

    public static LocalDate parseFecha (String fechaString ) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);
        return fecha;
    }

    public static Empleado[] empleadosFiltradosPorLetra (String letra, ArrayList<Empleado> empleados) {
        Empleado[] empleadosMatch = new Empleado[empleados.size()];
        int f = 0;
        for (int i = 0; i < empleados.size(); i ++ ) {
            if (empleados.get(i).apellido.toUpperCase().startsWith(letra.toUpperCase())){
                empleadosMatch[f] = empleados.get(i);
                f++;
            }
        }
        return empleadosMatch;
    }
}