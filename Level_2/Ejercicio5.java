package Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        

        List<Integer> horasTrabajadas = new ArrayList<>( 
            Arrays.asList(6, 7, 8, 4, 5)
        );

        List<Integer> valorPorHora = new ArrayList<>(
            Arrays.asList(350, 345 ,550, 600, 320)
        );

        List<Integer> sueldos = new ArrayList<>();

        for (int i = 0; i < horasTrabajadas.size(); i++ ) {
            sueldos.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }

        int sueldoSemanal = 0;

        for (int i = 0; i < sueldos.size(); i++){
            sueldoSemanal += sueldos.get(i);
        }

        System.out.println(sueldos);
        System.out.println("Sueldo semanal:   " + sueldoSemanal);
    }
}
