
package tareavirtual1_pr2;

import java.util.ArrayList;
import java.util.Scanner;



public class RegistroInstituto {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Mostrar Estudiantes Registrados");
            System.out.println("4. Mostrar Docentes Registrados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("\nRegistrando Estudiante:");
                    System.out.print("Nombre: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Cédula: ");
                    String cedulaEstudiante = scanner.nextLine();
                    System.out.print("Fecha de Nacimiento: ");
                    String fechaNacimientoEstudiante = scanner.nextLine();
                    System.out.print("Dirección Particular: ");
                    String direccionEstudiante = scanner.nextLine();
                    System.out.print("Título más alto obtenido: ");
                    String tituloEstudiante = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(nombreEstudiante, cedulaEstudiante, fechaNacimientoEstudiante,
                            direccionEstudiante, tituloEstudiante);
                    estudiantes.add(estudiante);
                    System.out.println("Estudiante registrado con éxito.");
                    break;

                case 2:
                    System.out.println("\nRegistrando Docente:");
                    System.out.print("Nombre: ");
                    String nombreDocente = scanner.nextLine();
                    System.out.print("Cédula: ");
                    String cedulaDocente = scanner.nextLine();
                    System.out.print("Fecha de Nacimiento: ");
                    String fechaNacimientoDocente = scanner.nextLine();
                    System.out.print("Dirección Particular: ");
                    String direccionDocente = scanner.nextLine();
                    System.out.print("Años de Experiencia: ");
                    int experienciaDocente = scanner.nextInt();

                    Docente docente = new Docente(nombreDocente, cedulaDocente, fechaNacimientoDocente,
                            direccionDocente, experienciaDocente);
                    docentes.add(docente);
                    System.out.println("Docente registrado con éxito.");
                    break;

                case 3:
                    System.out.println("\nEstudiantes Registrados:");
                    for (Estudiante est : estudiantes) {
                        System.out.println(est);
                        System.out.println(" ");
                    }
                    break;

                case 4:
                    System.out.println("\nDocentes Registrados:");
                    for (Docente doc : docentes) {
                        System.out.println(doc);
                        System.out.println(" ");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}