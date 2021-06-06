package Level_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<String> baraja = new ArrayList<>();

        cargarCartas(baraja);
        System.out.println("-----------------------------------");
        System.out.println("Valores de la baraja francesa:");
        for (int j = 0; j < baraja.size(); j++){
        System.out.println(baraja.get(j));
        }

        System.out.println("-----------------------------------");
        System.out.println("Baraja de forma inversa:");
        Collections.reverse(baraja);
        for (int i = 0; i < baraja.size(); i++ ){
            System.out.println(baraja.get(i));
        }
    
        System.out.println("-----------------------------------");
        System.out.println("Baraja mezaclada");
        Collections.shuffle(baraja);
        for (int k = 0; k < baraja.size(); k++) {
            System.out.println(baraja.get(k));
        }

    }

    public static void cargarCartas (List<String> baraja) {
        baraja.add ("A");   
        baraja.add ("2");
        baraja.add ("3");
        baraja.add ("4");
        baraja.add ("5");
        baraja.add ("6");
        baraja.add ("7");
        baraja.add ("8");
        baraja.add ("9");
        baraja.add ("J");
        baraja.add ("Q");
        baraja.add ("K");
    }

}
