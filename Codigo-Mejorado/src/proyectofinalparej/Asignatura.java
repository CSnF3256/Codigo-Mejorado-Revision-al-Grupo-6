package proyectofinalparej;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String codigo;
    private String nombre;
    private List<Alumno> alumnosInscritos;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la asignatura no puede ser nulo o vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la asignatura no puede ser nulo o vacío.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnosInscritos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la asignatura no puede ser nulo o vacío.");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la asignatura no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public void asignarProfesor(Profesor profesor) {
        if (profesor == null) {
            throw new IllegalArgumentException("El profesor no puede ser nulo.");
        }
        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void inscribirAlumno(Alumno alumno) {
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno no puede ser nulo.");
        } //lo que se arrojara en caso de excepcion
        alumnosInscritos.add(alumno);
    }

    public List<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void mostrarInfo() {
        System.out.println("Asignatura: " + nombre + " (Código: " + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor asignado: " + profesor.getNombre() + " " + profesor.getApellidos());
        } else {
            System.out.println("Profesor no asignado.");
        }
        System.out.println("Alumnos inscritos:");
        if (alumnosInscritos.isEmpty()) {
            System.out.println(" - No hay alumnos inscritos.");
        } else {
            for (Alumno alumno : alumnosInscritos) {
                System.out.println(" - " + alumno.getNombre() + " " + alumno.getApellidos());
            }
        }
    }
}
