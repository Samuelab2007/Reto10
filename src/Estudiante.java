import java.util.List;

public class Estudiante {
    private final String nombre;
    private final String apellido;
    private final double promedio;

    public Estudiante(String nombre, String apellido, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public static double mediaPromediosEstudiantes(List<Estudiante> e){

        return e.stream()
                .map(estudiante -> estudiante.promedio)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow();
    }

    public static StringBuilder mayorPromedio(List<Estudiante> e) {
        StringBuilder miEstudiante = new StringBuilder();
        double valorMaximo = e.stream().map(estudiante -> estudiante.promedio).max(Double::compare).orElseThrow();
                e.stream()
                .filter(unEstudiante -> unEstudiante.promedio == valorMaximo)
                .forEach(estudiante -> miEstudiante.append(estudiante.nombre).append(" ").append(estudiante.apellido));
                return miEstudiante;

    }
}
