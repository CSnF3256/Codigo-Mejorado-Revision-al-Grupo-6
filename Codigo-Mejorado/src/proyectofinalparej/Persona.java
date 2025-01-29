package proyectofinalparej;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String poblacion;
    private String cedula;
    private String fechaNacimiento;
    private String codigoPostal;
    private String telefono;

    public Persona(String nombre, String apellidos, String direccion, String poblacion, String cedula,
                   String fechaNacimiento, String codigoPostal, String telefono) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos no pueden ser nulos o vacíos.");
        }
        if (cedula == null || cedula.trim().isEmpty()) {
            throw new IllegalArgumentException("La cédula no puede ser nula o vacía.");
        }
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula o vacía.");
        }

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos no pueden ser nulos o vacíos.");
        }
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            throw new IllegalArgumentException("La cédula no puede ser nula o vacía.");
        }
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula o vacía.");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Dirección: " + direccion + ", " + poblacion + ", " + codigoPostal);
        System.out.println("Teléfono: " + telefono);
    }
}

