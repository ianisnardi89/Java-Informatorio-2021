import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        mayusculaString();
    }

    static char mayusculaChar(char valor) {
        int mayusculas = (int)valor - (int)'a' + (int)'A';
        char nuevo = (char)mayusculas;
        return nuevo;
    }

    static void mayusculaString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        sc.close();
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = mayusculaChar(caracteres[i]);
        }
        caracteres.toString();
        System.out.println(caracteres);
    }
}