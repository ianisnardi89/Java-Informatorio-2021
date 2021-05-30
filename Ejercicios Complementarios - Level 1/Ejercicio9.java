import java.util.Scanner;
import java.io.IOException;

public class Ejercicio9 {
    
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        char caracter;

        System.out.println("Introduce una cadena de caracteres");
        String cadena = scan.nextLine();


        System.out.println("Introduce un caracter");
        caracter = (char) System.in.read();
        scan.close();
        int numeroDeVeces = contarCaracteres(cadena, caracter);

        System.out.println(numeroDeVeces);
    }


    public static int contarCaracteres (String cadena, char caracter) {

            int posicion, contador = 0;

            posicion = cadena.indexOf(caracter);

            while ( posicion != -1) {
                contador++;
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
            return contador;
        }

}
