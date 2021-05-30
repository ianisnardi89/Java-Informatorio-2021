import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("Ingrese dos numero por teclado");
        num1 = scan.nextInt();
        num2 = scan.nextInt();


        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int resto = num1 % num2;

        scan.close();

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + resto);
    }
}
