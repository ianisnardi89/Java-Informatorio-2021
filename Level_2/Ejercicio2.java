package Level_2;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        int numero;
        System.out.println("Ingrese 5 numeros");

        for (int i = 1; i <= 5; i++ ){
            numero = scan.nextInt();
            lista.add(numero);
            System.out.println("");
            System.out.println("");
        }
        for (int n: lista){
            System.out.println("-----------------------");
            System.out.println(n);
        }
        System.out.println("Tamaño de la lista: " + lista.size());

        System.out.println("Ingrese 2 numeros mas");
        int n2 = scan.nextInt();
        lista.add(0, n2);
        int n3 = scan.nextInt();
        lista.add(n3);
        scan.close();

        for (int n: lista){
            System.out.println("-----------------------");
            System.out.println(n);

        }
        System.out.println("Tamaño de la lista: " + lista.size());


    }
}
