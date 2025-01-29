package proyectofinalparej;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    private Curso curso;
    private List<Asignatura> asignaturas;
    private double promedio;

    public Alumno(String nombre, String apellidos, String direccion, String poblacion, String cedula,
                  String fechaNacimiento, String codigoPostal, String telefono) {
        super(nombre, apellidos, direccion, poblacion, cedula, fechaNacimiento, codigoPostal, telefono);
        this.asignaturas = new ArrayList<>();
        this.promedio = 0.0;
    }

    public void asignarCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo.");
        }
        this.curso = curso;
    }

    public void inscribirAsignatura(Asignatura asignatura) {
        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura no puede ser nula.");
        }
        asignaturas.add(asignatura);
    }

    public void calcularPromedio(List<Double> calificaciones) {
        if (calificaciones == null || calificaciones.isEmpty()) {
            throw new IllegalArgumentException("La lista de calificaciones no puede estar vacía o ser nula.");
        }
        double suma = 0.0;
        for (Double calificacion : calificaciones) {
            if (calificacion < 0 || calificacion > 10) {
                throw new IllegalArgumentException("Cada calificación debe estar entre 0 y 10.");
            }
            suma += calificacion;
        }
        this.promedio = suma / calificaciones.size();
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + getNombre() + " " + getApellidos());
        System.out.println("Cédula: " + getCedula());
        if (curso != null) {
            System.out.println("Curso asignado: " + curso.getNombre());
        } else {
            System.out.println("No tiene curso asignado.");
        }
        System.out.println("Asignaturas inscritas:");
        if (asignaturas.isEmpty()) {
            System.out.println(" - No tiene asignaturas inscritas.");
        } else {
            for (Asignatura asignatura : asignaturas) {
                System.out.println(" - " + asignatura.getNombre());
            }
        }
        System.out.println("Promedio: " + promedio);
    }
}

