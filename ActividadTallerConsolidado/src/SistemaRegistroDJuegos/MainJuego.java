package SistemaRegistroDJuegos;
import java.util.ArrayList;
import java.util.Scanner;

public class MainJuego {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Juego> listaJuegos = new ArrayList<>();

        public static void main(String[] args) {

            int opcion;
            do {
                System.out.println("\n SISTEMA DE REGISTRO DE JUEGOS ");
                System.out.println("1. Registrar juego Mario Bros");
                System.out.println("2. Registrar juego Carrera de Vehículos");
                System.out.println("3. Mostrar todos los juegos");
                System.out.println("4. Buscar juego por nombre");
                System.out.println("5. Filtrar por tipo de juego");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = leerEntero();

                switch (opcion) {
                    case 1 -> registrarMarioBros();
                    case 2 -> registrarCarreraVehiculos();
                    case 3 -> mostrarJuegos();
                    case 4 -> buscarPorNombre();
                    case 5 -> filtrarPorTipo();
                    case 6 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 6);
        }

        // REGISTRAR MARIO BROS

        private static void registrarMarioBros() {
            try {
                System.out.println("\n--- Registrar Mario Bros ---");

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Año: ");
                int anio = leerEntero();

                System.out.print("Capacidad de jugadores: ");
                int capacidad = leerEntero();

                System.out.print("Niveles: ");
                int niveles = leerEntero();

                System.out.print("Personaje favorito: ");
                String personaje = sc.nextLine();

                MarioBros mb = new MarioBros(nombre, anio, capacidad, niveles, personaje);

                // validaciones con setters
                mb.setNombre(nombre);
                mb.setAnio(anio);
                mb.setCapacidadDJugadores(capacidad);
                mb.setNiveles(niveles);
                mb.setPersonajeFav(personaje);

                listaJuegos.add(mb);
                System.out.println("Mario Bros registrado exitosamente.");

            } catch (DatosInvalidos e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        // REGISTRAR CARRERA VEHÍCULOS

        private static void registrarCarreraVehiculos() {
            try {
                System.out.println("\n--- Registrar Juego de Carreras ---");

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Año: ");
                int anio = leerEntero();

                System.out.print("Capacidad de jugadores: ");
                int capacidad = leerEntero();

                System.out.print("Tipo de vehículo: ");
                String tipo = sc.nextLine();

                System.out.print("Terreno: ");
                String terreno = sc.nextLine();

                CarreraVehiculos cv = new CarreraVehiculos(nombre, anio, capacidad, tipo, terreno);

                // validaciones
                cv.setNombre(nombre);
                cv.setAnio(anio);
                cv.setCapacidadDJugadores(capacidad);
                cv.setTipoVehiculo(tipo);
                cv.setTerreno(terreno);

                listaJuegos.add(cv);
                System.out.println("Juego de carreras registrado exitosamente.");

            } catch (DatosInvalidos e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // MOSTRAR JUEGOS (POLIMORFISMO)

        private static void mostrarJuegos() {
            if (listaJuegos.isEmpty()) {
                System.out.println("No hay juegos registrados.");
                return;
            }

            System.out.println("\n--- Lista de Juegos Registrados ---");
            for (Juego j : listaJuegos) {
                j.Descripciones(); // POLIMORFISMO
                System.out.println("\n");
            }
        }


        // BUSCAR POR NOMBRE
        private static void buscarPorNombre() {
            System.out.print("Ingrese nombre a buscar: ");
            String buscar = sc.nextLine().toLowerCase();

            boolean encontrado = false;
            for (Juego j : listaJuegos) {
                if (j.getNombre().toLowerCase().contains(buscar)) {
                    j.Descripciones();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontraron juegos con ese nombre.");
            }
        }

        // FILTRAR POR TIPO
        private static void filtrarPorTipo() {
            System.out.println("1. Mario Bros");
            System.out.println("2. Carreras");
            System.out.print("Seleccione tipo: ");
            int tipo = leerEntero();

            boolean encontrado = false;

            for (Juego j : listaJuegos) {
                if (tipo == 1 && j instanceof MarioBros) {
                    j.Descripciones();
                    encontrado = true;
                } else if (tipo == 2 && j instanceof CarreraVehiculos) {
                    j.Descripciones();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron juegos de ese tipo.");
            }
        }

        // METODO AUXILIAR PARA LEER ENTEROS

        private static int leerEntero() {
            while (true) {
                try {
                    String entrada = sc.nextLine();
                    return Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.print("Ingrese un número válido: ");
                }
            }

    }
}
