package proyectofinalparej;

import java.util.*;

public class CentroEducativo {

    private String nombre;
    private List<Curso> cursos;
    private List<Asignatura> asignaturas;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;

    public CentroEducativo(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("\n=== Menú Principal ===");
                System.out.println("1. Añadir curso");
                System.out.println("2. Añadir asignatura");
                System.out.println("3. Registrar profesor");
                System.out.println("4. Registrar alumno");
                System.out.println("5. Mostrar información general");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        anadirCurso(scanner);
                        break;
                    case 2:
                        anadirAsignatura(scanner);
                        break;
                    case 3:
                        registrarProfesor(scanner);
                        break;
                    case 4:
                        registrarAlumno(scanner);
                        break;
                    case 5:
                        mostrarInformacion();
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) { // formato de numero excepcion
                System.out.println("Error: Ingrese un número válido.");
            } catch (InputMismatchException e) { // validar entrada de dato
                System.out.println("Error: Entrada inválida.");
                scanner.nextLine(); // Limpiar buffer
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
    }

    //informacion de cursos
    private void anadirCurso(Scanner scanner) {
        try {
            System.out.print("Ingrese el código del curso: ");
            String codigo = scanner.nextLine();
            System.out.print("Ingrese el nombre del curso: ");
            String nombre = scanner.nextLine();

            cursos.add(new Curso(codigo, nombre));
            System.out.println("Curso añadido con éxito.");
        } catch (Exception e) { //excepcion para correcto ingreso de datos
            System.out.println("Error al añadir curso: " + e.getMessage());
        }
    }

    //informacion de asignaturas
    private void anadirAsignatura(Scanner scanner) {
        try {
            System.out.print("Ingrese el código de la asignatura: ");
            String codigo = scanner.nextLine();
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = scanner.nextLine();

            asignaturas.add(new Asignatura(codigo, nombre));
            System.out.println("Asignatura añadida con éxito.");
        } catch (Exception e) {
            System.out.println("Error al añadir asignatura: " + e.getMessage());
        }
    }

    //info de profesor
    private void registrarProfesor(Scanner scanner) {
        try {
            System.out.print("Ingrese el nombre del profesor: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese los apellidos del profesor: ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese la ciudad: ");
            String poblacion = scanner.nextLine();
            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese la fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Ingrese el código postal: ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ingrese el teléfono: ");
            String telefono = scanner.nextLine();

            Profesor profesor = new Profesor(nombre, apellidos, direccion, poblacion, cedula, fechaNacimiento, codigoPostal, telefono);

            System.out.println("¿Cuántas asignaturas desea asignar al profesor?");
            int numAsignaturas = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numAsignaturas; i++) {
                System.out.println("Seleccione una asignatura por índice:");
                for (int j = 0; j < asignaturas.size(); j++) {
                    System.out.println(j + ". " + asignaturas.get(j).getNombre());
                }
                int indice = Integer.parseInt(scanner.nextLine());

                if (indice >= 0 && indice < asignaturas.size()) {
                    profesor.asignarAsignatura(asignaturas.get(indice));
                } else {
                    System.out.println("Índice inválido, asignatura omitida.");
                }
            }

            profesores.add(profesor);
            System.out.println("Profesor registrado con éxito.");

        } catch (NumberFormatException e) { // validar numero
            System.out.println("Error: Debe ingresar un número válido.");
        } catch (Exception e) { //cualquier problema mas que pueda haber
            System.out.println("Error al registrar profesor: " + e.getMessage());
        }
    }
//ingresar informacion del alumno
    private void registrarAlumno(Scanner scanner) {
        try {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese los apellidos del alumno: ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese la población: ");
            String poblacion = scanner.nextLine();
            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese la fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Ingrese el código postal: ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ingrese el teléfono: ");
            String telefono = scanner.nextLine();

            Alumno alumno = new Alumno(nombre, apellidos, direccion, poblacion, cedula, fechaNacimiento, codigoPostal, telefono);

            System.out.println("Seleccione un curso por índice:");
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println(i + ". " + cursos.get(i).getNombre());
            }
            int indice = Integer.parseInt(scanner.nextLine());

            if (indice >= 0 && indice < cursos.size()) {
                alumno.asignarCurso(cursos.get(indice));
                alumnos.add(alumno);
                System.out.println("Alumno registrado con éxito.");
            } else {
                System.out.println("Índice inválido, alumno no registrado.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        } catch (Exception e) {
            System.out.println("Error al registrar alumno: " + e.getMessage());
        }
    }

    //Metodo para mostrar la informacion
    private void mostrarInformacion() {
        System.out.println("\n=== Información General ===");

        System.out.println("\nCursos:");
        for (Curso curso : cursos) {
            System.out.println(" - " + curso.getNombre());
        }

        System.out.println("\nAsignaturas:");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(" - " + asignatura.getNombre());
        }

        System.out.println("\nProfesores:");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }

        System.out.println("\nAlumnos:");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInfo();
        }
    }
//Inicio del main
    public static void main(String[] args) {
        CentroEducativo centro = new CentroEducativo("Centro Educativo Ejemplo");
        centro.iniciar();
    }
}