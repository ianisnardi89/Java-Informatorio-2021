package practicaGuiada;
import java.util.*;

public class Ejercicio2 {
    
    public static void main (String[] args) {

        funcion();

    }

    
    public static void funcion () {

        int continuar = 1;

        Scanner scan = new Scanner(System.in);
        while(continuar ==1 ){

        System.out.println("A continuacion ingrese tres numeros");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("El primer nro ingresado es: " + num1);
        System.out.println("El segundo nro ingresado es: " + num2);
        System.out.println("El tercer nro ingresado es: " + num3);

        System.out.println("Si desea repetir el programa ingrese 1, de no ser asi cualquier otro numero");
        continuar = scan.nextInt();
        }
        scan.close();

    }

}
