// RegistroHorario.java
package proyectofinalparej;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroHorario {
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Asignatura asignatura;
    private Aula aula;
    private Profesor profesor;

    public RegistroHorario(String dia, LocalTime horaInicio, LocalTime horaFin) {
        if (dia == null || dia.trim().isEmpty()) {
            throw new IllegalArgumentException("El día no puede ser nulo o vacío.");
        } //lo que se arrojara en caso de excepcion
        if (horaInicio == null || horaFin == null) {
            throw new IllegalArgumentException("Las horas no pueden ser nulas.");
        } //lo que se arrojara en caso de excepcion
        if (horaFin.isBefore(horaInicio)) {
            throw new IllegalArgumentException("La hora de fin no puede ser anterior a la hora de inicio.");
        } //lo que se arrojara en caso de excepcion

        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void asignarAula(Aula aula) {
        if (aula == null) {
            throw new IllegalArgumentException("El aula no puede ser nula.");
            //lo que se arrojara en caso de excepcion
        }
        this.aula = aula;
    }

    public void asignarAsignatura(Asignatura asignatura) {
        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura no puede ser nula.");
        }
        this.asignatura = asignatura;
    }

    public void asignarProfesor(Profesor profesor) {
        if (profesor == null) {
            throw new IllegalArgumentException("El profesor no puede ser nulo.");
        }
        this.profesor = profesor;
    }

    // Getters y setters
    public String getDia() { return dia; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public LocalTime getHoraFin() { return horaFin; }
    public Asignatura getAsignatura() { return asignatura; }
    public Aula getAula() { return aula; }
    public Profesor getProfesor() { return profesor; }

    public void mostrarInfo() {
        System.out.println("Horario: " + dia + " de " + horaInicio + " a " + horaFin);
        if (asignatura != null) System.out.println("Asignatura: " + asignatura.getNombre());
        if (aula != null) System.out.println("Aula: " + aula.getNumero());
        if (profesor != null) System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellidos());
    }
}