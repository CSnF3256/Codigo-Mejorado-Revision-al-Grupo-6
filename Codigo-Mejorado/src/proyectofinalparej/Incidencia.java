package proyectofinalparej;

import java.time.LocalDateTime;

public class Incidencia {
    private Alumno alumno;
    private String descripcion;
    private LocalDateTime fecha;
    private String tipoIncidencia;
    private String estado;

    public Incidencia(Alumno alumno, String descripcion, String tipoIncidencia) {
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno no puede ser nulo.");
        }
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede ser nula o vacía.");
        }
        if (tipoIncidencia == null || tipoIncidencia.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de incidencia no puede ser nulo o vacío.");
        }

        this.alumno = alumno;
        this.descripcion = descripcion;
        this.tipoIncidencia = tipoIncidencia;
        this.fecha = LocalDateTime.now();
        this.estado = "Pendiente";
    }

    public void resolverIncidencia(String resolucion) {
        if (resolucion == null || resolucion.trim().isEmpty()) {
            throw new IllegalArgumentException("La resolución no puede ser nula o vacía.");
        }
        this.descripcion += "\nResolución: " + resolucion;
        this.estado = "Resuelta";
    }

    // Getters
    public Alumno getAlumno() { return alumno; }
    public String getDescripcion() { return descripcion; }
    public LocalDateTime getFecha() { return fecha; }
    public String getTipoIncidencia() { return tipoIncidencia; }
    public String getEstado() { return estado; }
}
