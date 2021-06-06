package Level_2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    

    public static void main (String[] args) {

        List<String> alumnos = new ArrayList<>();
        cargarAlumnos(alumnos);

        List<String> cursoA = alumnos.subList(0, 4);
        List<String> cursoB = alumnos.subList(4, 8);
        List<String> cursoC = alumnos.subList(8, 12);

        System.out.println("----------------------------------");
        System.out.println("Curso A");
        for (int i = 0; i < cursoA.size(); i++) {
            System.out.println(cursoA.get(i));
        }

        System.out.println("----------------------------------");
        System.out.println("Curso B");
        for (int i = 0; i < cursoB.size(); i++) {
            System.out.println(cursoB.get(i));
        }

        System.out.println("----------------------------------");
        System.out.println("Curso C");
        for (int i = 0; i < cursoC.size(); i++) {
            System.out.println(cursoC.get(i));
        }


    }
    public static void cargarAlumnos ( List<String> alumnos) {
        alumnos.add ("Jose");   
        alumnos.add ("Mario");
        alumnos.add ("Florencia"); 
        alumnos.add ("Yoel"); 
        alumnos.add ("Rodrigo"); 
        alumnos.add ("Eugenia"); 
        alumnos.add ("Romina"); 
        alumnos.add ("Fabricio"); 
        alumnos.add ("Magali"); 
        alumnos.add ("Bianca"); 
        alumnos.add ("Natali"); 
        alumnos.add ("Rosa"); 
    }

}


