package proyectofinalparej;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<Asignatura> asignaturasImpartidas;
    private List<RegistroHorario> horarios;

    public Profesor(String nombre, String apellidos, String direccion, String poblacion,
                    String cedula, String fechaNacimiento, String codigoPostal, String telefono) {
        super(nombre, apellidos, direccion, poblacion, cedula, fechaNacimiento, codigoPostal, telefono);
        this.asignaturasImpartidas = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public void asignarAsignatura(Asignatura asignatura) {
        if (asignatura == null) {
            throw new IllegalArgumentException("La asignatura no puede ser nula.");
        }
        asignaturasImpartidas.add(asignatura);
        asignatura.asignarProfesor(this);
    }

    public void agregarHorario(RegistroHorario horario) {
        if (horario == null) {
            throw new IllegalArgumentException("El horario no puede ser nulo.");
        }
        horarios.add(horario);
    }

    public List<Asignatura> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public List<RegistroHorario> getHorarios() {
        return horarios;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Asignaturas impartidas:");
        if (asignaturasImpartidas.isEmpty()) {
            System.out.println(" - No tiene asignaturas asignadas.");
        } else {
            for (Asignatura asignatura : asignaturasImpartidas) {
                System.out.println(" - " + asignatura.getNombre());
            }
        }
    }
}