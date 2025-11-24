package RegistroDOlimpiadas;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosPrecios {

    public static void ingresarPrecios(Scanner sc, ArrayList<Double> lista) {
        System.out.println("Ingrese el precio:");
        double precio = sc.nextDouble();

        if (precio > 0) {
            lista.add(precio);
            System.out.println("El precio se agrego correctamente");
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }

    public static void mostrarPrecios(ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("No existen precios registrados.");
            return;
        }

        System.out.println("Lista de precios:");
        for (double p : lista) {
            System.out.println("$ " + p);
        }
    }

    public static void precioMasAlto(ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("No existen precios registrados.");
            return;
        }

        double max = lista.get(0);
        for (double p : lista) {
            if (p > max) {
                max = p;
            }
        }

        System.out.println("Precio más alto: $" + max);
    }

    public static void precioMasBajo(ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("No existen precios registrados.");
            return;
        }

        double min = lista.get(0);
        for (double p : lista) {
            if (p < min) {
                min = p;
            }
        }

        System.out.println("Precio más bajo: $" + min);
    }

    public static void precioIguales(Scanner sc, ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("No existen precios registrados.");
            return;
        }

        System.out.print("Ingrese el precio que desea buscar para coincidencias: ");
        double precioBuscado = sc.nextDouble();

        boolean encontrado = false;

        System.out.println("Precios iguales encontrados:");

        for (double p : lista) {
            if (p == precioBuscado) {
                System.out.println("$ " + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron precios iguales.");
        }
    }

    public static void buscarPrecio(Scanner sc, ArrayList<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("No existen precios registrados.");
            return;
        }

        System.out.print("Ingrese el precio a buscar: ");
        double precio = sc.nextDouble();

        if (lista.contains(precio)) {
            System.out.println("El precio $" + precio + " SÍ se encuentra registrado.");
        } else {
            System.out.println("El precio $" + precio + " NO se encuentra registrado.");
        }

    }
}