package Level_2;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Juan Perez", 29566322, 25, 300);
        Empleado emp2 = new Empleado("Facundo Maldonado", 30555689, 30, 350);  
        Empleado emp3 = new Empleado("Marta Romero", 25676895, 40, 300);  
        Empleado emp4 = new Empleado("Homero Simpson", 35682955, 25, 300);  
        Empleado emp5 = new Empleado("Lisa Simpson", 29547123, 40, 350);  
        Empleado emp6 = new Empleado("Eldo Larcito", 41564522, 35, 400);
        
        
        Set<Empleado> empleados = new HashSet<>(){{
            add(emp1);
            add(emp2);
            add(emp3);
            add(emp4);
            add(emp5);
            add(emp6);
        }};


        Map<Integer, Integer> sueldos = new HashMap<>();

        for (Empleado e: empleados) {
            sueldos.put(e.dni, (e.horasTrabajadas * e.valorPorHora));
        }

        System.out.println("------------------------");
        System.out.println(sueldos.get(emp1.dni));
        System.out.println(sueldos.get(emp2.dni));
        System.out.println(sueldos.get(emp3.dni));
        System.out.println(sueldos.get(emp4.dni));
        System.out.println(sueldos.get(emp5.dni));
        System.out.println(sueldos.get(emp6.dni));
















    }
}
