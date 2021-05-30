import java.util.*;

public class Ejercicio2 {
    
    public static void main (String[] args) {

        int continuar = 1;

        Scanner scan = new Scanner(System.in);
        while(continuar ==1 ){
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        


        System.out.println("El primer nro ingresado es: " + a);
        System.out.println("El segundo nro ingresado es: " + b);
        System.out.println("El tercer nro ingresado es: " + c);

        System.out.println("Si desea repetir el programa ingrese 1, de no ser asi cualquier otro numero");
        continuar = scan.nextInt();
        }
        scan.close();
    }
}
