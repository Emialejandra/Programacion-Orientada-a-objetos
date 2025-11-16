import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mostrar productos. \n2. Registrar productos.\n3. Salir.");
        System.out.println("Ingrese una opcion: ");
        int opcion = sc.nextInt();

        try {
            switch (opcion) {
                case 1:
                    System.out.println("Mostrando productos...");
                    break;
                case 2:
                    System.out.println("Registrando productos...");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new Exception("Opcion no valida");
            }
        }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
