package practicaGuiada;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1){
            System.out.println("Por favor, ingrese un número: ");
            nro = scan.nextInt();
            System.out.println("El número ingresado es: " + nro);

            System.out.println("Si desea continuar presione 1, sino cualquier otro número");
            continuar = scan.nextInt();
        }
        scan.close();
    }
    
}
