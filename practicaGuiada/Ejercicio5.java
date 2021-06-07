import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1){
            int nro;
            nro = scan.nextInt();

            for (int i=1; i<=10; i++ ){
                System.out.println(nro + " * " + i + " = " + nro*i);
            }
            
            System.out.println("Si desea repetir el programa presione 1, de no ser asi cualquier otro numero");
            continuar = scan.nextInt();
        }
        scan.close();
    }
}
