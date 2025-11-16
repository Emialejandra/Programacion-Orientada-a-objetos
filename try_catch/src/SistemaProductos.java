import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> lista = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n     MENÚ    ");
            System.out.println("1. Registrar producto.");
            System.out.println("2. Mostrar productos.");
            System.out.println("3. Promedio de precios finales.");
            System.out.println("4. Salir.");
            System.out.print("Opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // ← limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Precio Base: ");
                        double precioBase = Double.parseDouble(sc.nextLine());

                        System.out.print("1= Nacional | 2= Importado: ");
                        int tipo = Integer.parseInt(sc.nextLine());

                        Producto p;

                        if (tipo == 1)
                            p = new ProductoNacional(codigo, nombre, precioBase);
                        else if (tipo == 2)
                            p = new ProductoImportado(codigo, nombre, precioBase);
                        else
                            throw new Exception("Tipo no válido.");

                        lista.add(p);
                        System.out.println("Producto registrado.");
                        break;

                    case 2:
                        if (lista.isEmpty())
                            throw new DatosInvalidos("La lista está vacía.");

                        for (Producto prod : lista)
                            System.out.println(prod);
                        break;

                    case 3:
                        if (lista.isEmpty())
                            throw new DatosInvalidos("No se puede calcular promedio sin productos.");

                        double suma = 0;
                        for (Producto prod : lista)
                            suma += prod.getPrecioFinal();

                        System.out.println("Promedio: $" + (suma / lista.size()));
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar números válidos.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (DatosInvalidos e) {
                System.out.println("Aviso: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (opcion != 4);  // ← corregido

    }
}

