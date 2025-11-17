import java.util.Scanner;
import java.util.ArrayList;
public class SistemaOlimpiadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Olimpiada olimp = new Olimpiada("Olimpiadas Mundiales", 2025, "Tokio");

        int opcion;

        do {
            System.out.println("\n  MENÚ SISTEMA OLIMPIADAS   ");
            System.out.println("1. Registrar evento");
            System.out.println("2. Registrar participante en un evento");
            System.out.println("3. Mostrar eventos");
            System.out.println("4. Mostrar participantes de un evento");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del evento: ");
                    String nom = sc.nextLine();
                    System.out.print("Categoría del evento: ");
                    String cat = sc.nextLine();

                    olimp.agregarEvento(new Evento(nom, cat));
                    System.out.println("Evento registrado.");
                    break;

                case 2:
                    if (olimp.getEventos().isEmpty()) {
                        System.out.println("Primero debe registrar eventos.");
                        break;
                    }

                    System.out.println("Seleccione evento:");
                    for (int i = 0; i < olimp.getEventos().size(); i++) {
                        System.out.println((i + 1) + ". " + olimp.getEventos().get(i).getNombreEvento());
                    }

                    int ev = sc.nextInt();
                    sc.nextLine();
                    Evento eventoSel = olimp.getEventos().get(ev - 1);

                    try {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.println("Tipo de participante:");
                        System.out.println("1. Atleta");
                        System.out.println("2. Equipo");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        if (tipo == 1) {
                            System.out.print("Deporte: ");
                            String deporte = sc.nextLine();

                            if (deporte.isEmpty())
                                throw new DatosInvalidosException("El deporte no puede estar vacío.");

                            eventoSel.agregarParticipante(new Atleta(id, nombre, deporte));

                        } else if (tipo == 2) {
                            System.out.print("País: ");
                            String pais = sc.nextLine();
                            System.out.print("Número de integrantes: ");
                            int num = sc.nextInt();
                            sc.nextLine();

                            if (num <= 0)
                                throw new DatosInvalidosException("El número de integrantes debe ser mayor que 0.");

                            eventoSel.agregarParticipante(new Equipo(id, nombre, pais, num));
                        }

                        System.out.println("Participante registrado.");

                    } catch (DatosInvalidosException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 3:
                    olimp.listarEventos();
                    break;

                case 4:
                    if (olimp.getEventos().isEmpty()) {
                        System.out.println("No hay eventos disponibles.");
                        break;
                    }

                    System.out.println("Seleccione evento para ver participantes:");
                    for (int i = 0; i < olimp.getEventos().size(); i++) {
                        System.out.println((i + 1) + ". " + olimp.getEventos().get(i).getNombreEvento());
                    }

                    int ev2 = sc.nextInt();
                    sc.nextLine();

                    olimp.getEventos().get(ev2 - 1).listarParticipantes();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
