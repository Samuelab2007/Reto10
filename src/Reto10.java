/*
* Hecho por:
*           Efraín García Valencia(1001370984)
*           Samuel Acevedo Bustamante(1001016099)
* */


import java.util.*;

public class Reto10 {

    public static void main(String[] args){
        
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.2);
        numeros.add(5.0);
        numeros.add(4.0);
        numeros.add(45.32);
        numeros.add(100.0);

        HashSet<String> caracteres = new HashSet<>();

        caracteres.add("cinco");
        caracteres.add("holistico");
        caracteres.add("Adios");
        caracteres.add("Algoritmo");
        caracteres.add("a");
        System.out.println("Las palabras con más de cinco caracteres son: " + depuradorStrings(caracteres));
        System.out.println("El factorial del numero 7 es: "+factorial(7));
        System.out.println("La suma de digitos de 356428 es: "+sumaDeDigitos(356428));
        System.out.println("La raiz cuadrada de los numeros de la lista: "+numeros+" es: "+raicesCuadradas(numeros));

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Robledo", 3.6));
        estudiantes.add(new Estudiante("Daniel", "Jaramillo", 4.7));
        estudiantes.add(new Estudiante("Samuel", "Acevedo", 5.0));
        estudiantes.add(new Estudiante("Manuela", "Martinez", 3.2));
        estudiantes.add(new Estudiante("Daniela", "Gomez", 4.3));
        estudiantes.add(new Estudiante("Sara", "Camargo", 4.5));
        System.out.println("Media de promedios de los estudiantes:" + Estudiante.mediaPromediosEstudiantes(estudiantes));
        System.out.println("Estudiante con mayor promedio:" + Estudiante.mayorPromedio(estudiantes));
        System.out.println("Estudiante con menor promedio:" + Estudiante.menorPromedio(estudiantes));
    }

    public static int sumaDeDigitos(int n){
        if (n == 0)
            return 0;
        return (n % 10 + sumaDeDigitos(n / 10));
    }

    public static List<Double> raicesCuadradas(List<Double> numeros){
        return numeros.stream()
                .map(a->Math.sqrt(a))
                .toList();
    }

    public  static long factorial(long n){
        return n == 1 ? 1 : n * factorial(n-1);
    }

    public static List<String> depuradorStrings(Set<String> palabras){
        return palabras.stream()
                .filter(a -> a.length() >= 5)
                .toList();
    }

}
