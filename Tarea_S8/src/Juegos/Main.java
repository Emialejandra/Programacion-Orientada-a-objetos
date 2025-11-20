package Juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        int opcion;
        do {
            System.out.println("\n   MENÚ PRINCIPAL   ");
            System.out.println("1. Registrar juego\n" +
                    "2. Mostrar juegos\n" +
                    "3. Buscar juego por nombre\n" +
                    "4. Filtrar por tipo de juego\n" +
                    "5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\n¿Qué tipo de juego desea registrar?");
                    System.out.println("1. Mario Bross");
                    System.out.println("2. Carrera de Vehículos");
                    System.out.print("Seleccione: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    try {
                        System.out.print("Nombre del juego: ");
                        String nombre = sc.nextLine();

                        System.out.print("Año de lanzamiento: ");
                        int anio = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Plataforma: ");
                        String plataforma = sc.nextLine();

                        if (tipo == 1) {
                            System.out.print("Personaje principal: ");
                            String personaje = sc.nextLine();

                            System.out.print("Cantidad de mundos: ");
                            int mundos = sc.nextInt();

                            juegos.add(new MarioBross(nombre, anio, plataforma, personaje, mundos));
                            System.out.println("Juegos.Juego Mario Bross registrado correctamente.");

                        } else if (tipo == 2) {
                            System.out.print("Velocidad máxima: ");
                            double velocidad = sc.nextDouble();

                            System.out.print("Niveles: ");
                            int niveles = sc.nextInt();

                            juegos.add(new CarreraVehiculos(nombre, anio, plataforma, velocidad, niveles));
                            System.out.println("Juegos.Juego de Carreras registrado correctamente.");

                        } else {
                            System.out.println("Opción inválida.");
                        }

                    } catch (DatosInvalidos e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (juegos.isEmpty()) {
                        System.out.println("No hay juegos registrados.");
                    } else {
                        System.out.println("\n=== LISTA DE JUEGOS REGISTRADOS ===");
                        for (Juego j : juegos) {
                            j.mostrarDetalles();
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nIngrese parte del nombre: ");
                    String texto = sc.nextLine().toLowerCase();

                    boolean encontradoNombre = false;

                    for (Juego j : juegos) {
                        if (j.getNombre().toLowerCase().contains(texto)) {
                            j.mostrarDetalles();
                            encontradoNombre = true;
                        }
                    }

                    if (!encontradoNombre) {
                        System.out.println("No se encontraron juegos con ese nombre.");
                    }
                    break;

                case 4:
                    System.out.println("\nFiltrar por tipo:");
                    System.out.println("1. Mario Bross");
                    System.out.println("2. Carrera de Vehículos");
                    System.out.print("Seleccione: ");
                    int filtro = sc.nextInt();
                    sc.nextLine();

                    boolean encontradoTipo = false;

                    if (filtro == 1) {
                        System.out.println("\n=== JUEGOS MARIO BROSS ===");
                        for (Juego j : juegos) {
                            if (j instanceof MarioBross) {
                                j.mostrarDetalles();
                                encontradoTipo = true;
                            }
                        }
                    } else if (filtro == 2) {
                        System.out.println("\n=== JUEGOS DE CARRERAS ===");
                        for (Juego j : juegos) {
                            if (j instanceof CarreraVehiculos) {
                                j.mostrarDetalles();
                                encontradoTipo = true;
                            }
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }

                    if (!encontradoTipo) {
                        System.out.println("No existen juegos del tipo seleccionado.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}

