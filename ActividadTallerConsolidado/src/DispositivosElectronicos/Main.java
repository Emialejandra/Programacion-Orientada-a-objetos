package DispositivosElectronicos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dispositivo> lista = new ArrayList<>();

        try {
            lista.add(new Laptop("HP", "Pavilion 14", 850.75, 8));
            lista.add(new Telefono("Xiaomi", "Redmi Note 13", 299.99, "Android"));

            // Prueba con error para ver excepción
            lista.add(new Telefono("Motorola", "", 450, "Android"));
        }

        catch (DatoInvalidoExceptions e) {
            System.out.println(" Error al crear dispositivo: " + e.getMessage());
        }

        System.out.println("\n LISTA DE DISPOSITIVOS ");
        for (Dispositivo d : lista) {
            d.mostrarInformacion();
        }
    }
}
