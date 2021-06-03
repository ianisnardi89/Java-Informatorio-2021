package Level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner (System.in);

        List<String> ciudades = new ArrayList<>();
        String ciudad;

        int e = 1;

        while (e == 1){
            System.out.println("Ingrese una ciudad");
            ciudad = scan.nextLine();
            ciudades.add(ciudad);

            System.out.println("Si desea agregar otra ciudad presione 1 de no ser asi presione cualquier otro");
            e = scan2.nextInt();
        }
        scan.close();
        scan2.close();

        for (int i = 0; i < ciudades.size(); i++){
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }
    }
}