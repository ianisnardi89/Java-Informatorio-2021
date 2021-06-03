package Level_1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese nombre y apellido");
        String nombreYApellido = scan.nextLine();

        System.out.println("Ingrese su edad");
        String edad = scan.nextLine();
        
        System.out.println("Ingrese su direccion");
        String direccion = scan.nextLine();
        
        System.out.println("Ingrese su ciudad");
        String ciudad = scan.nextLine();
        scan.close();


        String infor = ciudad + " - " + direccion + " - " + edad + " - " + nombreYApellido;

        System.out.println(infor);
    }
}
