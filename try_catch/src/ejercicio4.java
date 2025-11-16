import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingrese el monto del pago: ");
        double pago = Double.parseDouble(sc.nextLine());

        if (pago < 0)
            throw new PagoInvalido("El pago no puede ser negativo.");
        if (pago == 0)
            throw new PagoInvalido("El pago no puede ser 0.");
        if (pago > 5000)
            throw new PagoInvalido("El pago no puede superar los $5000.");

        System.out.println("Pago registrado correctamente.");

    } catch (PagoInvalido e) {
        System.out.println("Error: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Debe ingresar números.");
    }
    }
}
