import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int continuar = 0;

        while (continuar == 0) {

            int dia = scan.nextInt();

            switch(dia){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                }
            System.out.println("Si desea repetir el programa ingrese 0, de no ser asi cualquier otro número");
            continuar = scan.nextInt();
        }
        scan.close();
    }
}
