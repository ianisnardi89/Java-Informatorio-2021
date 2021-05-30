import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero");int nro = scan.nextInt();
        scan.close();

        System.out.println("El factorial de: " + nro + " es: " + factorial(nro));
  
    }

    public static int factorial(int n) {
        int numero = 1;
        for (int i = 1; i <= n; i++){
            numero *= i;
        }
        return numero;
    }
}
