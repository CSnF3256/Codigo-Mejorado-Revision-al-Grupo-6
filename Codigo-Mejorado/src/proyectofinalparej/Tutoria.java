package proyectofinalparej;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Tutoria {
    private Profesor tutor;
    private Curso curso;
    private List<LocalDateTime> horarioAtencion;
    private List<String> alumnosAtendidos;

    public Tutoria(Profesor tutor, Curso curso) {
        if (tutor == null) {
            throw new IllegalArgumentException("El tutor no puede ser nulo.");
        }
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo.");
        }

        this.tutor = tutor;
        this.curso = curso;
        this.horarioAtencion = new ArrayList<>();
        this.alumnosAtendidos = new ArrayList<>();
    }

    public void agregarHorarioAtencion(LocalDateTime horario) {
        if (horario == null) {
            throw new IllegalArgumentException("El horario no puede ser nulo.");
        }
        if (horario.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("No se puede agregar un horario pasado.");
        }
        horarioAtencion.add(horario);
    }

    public void registrarAtencion(String alumno, String asunto) {
        if (alumno == null || alumno.trim().isEmpty()) {
            throw new IllegalArgumentException("El alumno no puede ser nulo o vacío.");
        }
        if (asunto == null || asunto.trim().isEmpty()) {
            throw new IllegalArgumentException("El asunto no puede ser nulo o vacío.");
        }
        alumnosAtendidos.add(alumno + " - " + asunto + " - " + LocalDateTime.now());
    }

    // Getters
    public Profesor getTutor() { return tutor; }
    public Curso getCurso() { return curso; }
    public List<LocalDateTime> getHorarioAtencion() { return horarioAtencion; }
    public List<String> getAlumnosAtendidos() { return alumnosAtendidos; }

    public void mostrarInfo() {
        System.out.println("Tutoría");
        System.out.println("Tutor: " + tutor.getNombre() + " " + tutor.getApellidos());
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Horarios de atención:");
        for (LocalDateTime horario : horarioAtencion) {
            System.out.println(" - " + horario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        }
    }
}
