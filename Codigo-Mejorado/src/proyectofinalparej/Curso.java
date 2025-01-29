package proyectofinalparej;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Curso(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código del curso no puede ser nulo o vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede ser nulo o vacío.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno no puede ser nulo.");
        } //lo que se arrojara en caso de excepcion
        alumnos.add(alumno);
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura no puede ser nula.");
        }
        asignaturas.add(asignatura);
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public List<Alumno> getAlumnos() { return alumnos; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (Código: " + codigo + ")");
        System.out.println("Número de alumnos: " + alumnos.size());
        System.out.println("Asignaturas:");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(" - " + asignatura.getNombre());
        }
    }
}

