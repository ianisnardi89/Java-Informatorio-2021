package practicaGuiada;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        funcion();
        
    }

    public static void funcion () {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;

        while(continuar == 1) {
        
        System.out.println("Ingresa la nota");
        int nota = scan.nextInt();
        
        if (nota > 92) {
            System.out.println("Excelente");
        }else if (nota > 84) {
            System.out.println("Sobresaliente");
        }else if (nota > 74){
            System.out.println("Distinguido");
        }else if (nota > 59){
            System.out.println("Bueno");
        }else {
            System.out.println("Desaprobado");
        }
        System.out.println("Si desea repetir el programa ingrese 1, de no ser asi cualquier otro numero");
        continuar = scan.nextInt();
    }
    scan.close();
    }
}
