import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solicitar datos al cliente
        // Solicitar datos al usuario
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = sc.nextLine();

        // Crear objeto Cliente con los datos ingresados
        Cliente cliente = new Cliente(nombre, cedula, direccion, telefono);

        // Registrar tipo de cuenta
        System.out.print("Ingrese tipo de cuenta (Ahorros / Corriente): ");
        String tipoCuenta = sc.nextLine();

        cliente.registrarCuenta(tipoCuenta);

        System.out.println("\n--- Resumen del cliente ---");
        cliente.verResumenFinanciero();
    }

}

