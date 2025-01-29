package proyectofinalparej;

public class Aula {
    private String numero;
    private int capacidad;
    private String tipo;
    private boolean tieneProyector;
    private boolean piso;
    private boolean tieneComputadoras;

    public Aula(String numero, int capacidad, String tipo) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de aula no puede ser nulo o vacío.");
        } //lo que se arrojara en caso de excepcion
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de aula no puede ser nulo o vacío.");
        }

        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.piso = piso;
        this.tieneProyector = false;
        this.tieneComputadoras = false;
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
    public String getTipo() { return tipo; }
    public boolean tieneProyector() { return tieneProyector; }
    public boolean tieneComputadoras() { return tieneComputadoras; }

    public boolean isPiso() {
        return piso;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    public void setTieneComputadoras(boolean tieneComputadoras) {
        this.tieneComputadoras = tieneComputadoras;
    }

    public void mostrarInfo() {
        System.out.println("Aula: " + numero);
        System.out.println("Capacidad: " + capacidad + " estudiantes");
        System.out.println("Tipo: " + tipo);
        System.out.println("Equipamiento:");
        System.out.println(" - Proyector: " + (tieneProyector ? "Sí" : "No"));
        System.out.println(" - Computadoras: " + (tieneComputadoras ? "Sí" : "No"));
        System.out.println(" - Piso: " + isPiso());

    }
}


