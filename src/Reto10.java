import java.util.ArrayList;
import java.util.List;

public class Reto10 {

    public static void main(String[] args){

        System.out.println(sumaDeDigitos(5876));

        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.2);
        numeros.add(5.0);
        numeros.add(4.0);
        numeros.add(45.32);
        numeros.add(100.0);
        System.out.println(raicesCuadradas(numeros));

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Robledo", 3.6));
        estudiantes.add(new Estudiante("Daniel", "Jaramillo", 4.7));
        estudiantes.add(new Estudiante("Samuel", "Acevedo", 5.0));
        estudiantes.add(new Estudiante("Manuela", "Martinez", 3.2));
        estudiantes.add(new Estudiante("Daniela", "Gomez", 4.3));
        estudiantes.add(new Estudiante("Sara", "Camargo", 4.5));
        System.out.println("Media de promedios de los estudiantes:" + Estudiante.mediaPromediosEstudiantes(estudiantes));
    }

    public static int sumaDeDigitos(int n){
        if (n == 0)
            return 0;
        return (n % 10 + sumaDeDigitos(n / 10));
    }

    public static List<Double> raicesCuadradas(List<Double> numeros){
        return numeros.stream().map(a->Math.sqrt(a)).toList();
    }



}
