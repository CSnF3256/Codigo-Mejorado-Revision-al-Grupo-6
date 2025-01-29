

package proyectofinalparej;

import java.time.LocalDate;

public class Calificacion {
    private Alumno alumno;
    private Asignatura asignatura;
    private double nota;
    private String periodo;
    private LocalDate fecha;

    public Calificacion(Alumno alumno, Asignatura asignatura, double nota, String periodo) {
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno no puede ser nulo.");
        }
        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura no puede ser nula.");
        }
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        if (periodo == null || periodo.trim().isEmpty()) {
            throw new IllegalArgumentException("El periodo no puede ser nulo o vacío.");
        }

        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
        this.periodo = periodo;
        this.fecha = LocalDate.now();
    }

    // Getters y setters
    public Alumno getAlumno() { return alumno; }
    public Asignatura getAsignatura() { return asignatura; }
    public double getNota() { return nota; }
    public String getPeriodo() { return periodo; }
    public LocalDate getFecha() { return fecha; }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        this.nota = nota;
    }
}
