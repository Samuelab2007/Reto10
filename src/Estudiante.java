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

    public static double mediaPromediosEstudiantes(List<Estudiante> estudiantes){
        return estudiantes.stream().map(estudiante -> estudiante.promedio).mapToDouble(Double::doubleValue).average().getAsDouble();
    }
}
