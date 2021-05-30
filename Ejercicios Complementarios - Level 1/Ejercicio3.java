import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero");int nro = scan.nextInt();
        scan.close();

        for (int i = 1; i <= nro; i++){
            System.out.println("");
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
        }
        System.out.println("");
    }
}
