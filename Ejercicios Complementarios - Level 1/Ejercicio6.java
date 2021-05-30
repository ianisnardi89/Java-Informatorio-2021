import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");int nro1=scan.nextInt();int nro2=scan.nextInt();
        scan.close();

        int resultado = 0;
        for (int i = 1; i <= nro2; i++){
            resultado += nro1;
        }
        System.out.println(nro1 + " * " + nro2 + " = " + resultado);

    }
    
}
