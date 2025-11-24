package SistemaRegistroEmpleados;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
//        TiempoCompleto tc = new TiempoCompleto();
//        MedioTiempo mt= new MedioTiempo();

        ArrayList<TechESFOT> trabajadores = new ArrayList<>();

        do {
            System.out.println(" MENÚ DE EMPLEADOS ");
            System.out.println("1. Registrar empleado de tiempo completo");
            System.out.println("2. Registrar empleado de medio tiempo");
            System.out.println("3. Mostrar empleados registrados");
            System.out.println("4. Mostrar Estadísticas");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Registro de empleados de tiempo completo:");
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt();
                        System.out.println("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Apellido: ");
                        String apellido = sc.nextLine();
                        System.out.println("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.println("Sueldo Base: ");
                        double sueldoBase = sc.nextDouble();
                        System.out.println("Horas: ");
                        int horas = sc.nextInt();
                        System.out.println("Años de experiencia: ");
                        int experiencia = sc.nextInt();
                        System.out.println("Bono: ");
                        double bono = sc.nextDouble();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    } finally {
                        System.out.println("Empleado registrado exitosamente");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt();
                        System.out.println("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Apellido: ");
                        String apellido = sc.nextLine();
                        System.out.println("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.println("Sueldo Base: ");
                        double sueldoBase = sc.nextDouble();
                        System.out.println("Horas: ");
                        int horas = sc.nextInt();
                        System.out.println("Horario: ");
                        int horario = sc.nextInt();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    } finally {
                        System.out.println("Empleado registrado exitosamente");
                    }
                    break;
                case 3:
                    System.out.println("Mostrar Empleados");
                    ArrayList<MedioTiempo> medio = new ArrayList<>();
                    try {
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.println("Estadisticas ");
                    break;

                case 5:
                    System.out.println("Salida ");
                    break;
            }
        }
        while (opcion != 5);
    }
}
