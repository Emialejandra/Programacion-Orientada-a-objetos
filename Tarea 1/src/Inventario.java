import java.util.Scanner;
public class Inventario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        double Cant_Total=0;

        System.out.println("\n---Registro de un Inventario Plastico.---");
        System.out.println("Ingrese la cantidad de productos plasticos a registrar: ");
        numero=sc.nextInt();
        sc.nextLine();
//bucle para registrar los productos
        for(int i=1;i<=numero;i++){
            System.out.println("\nProducto " + i + ":");
            System.out.print("Nombre del producto: ");
            String nombre=sc.nextLine();

            System.out.print("Cantidad en stock: ");
            int cantidad=sc.nextInt();

            System.out.print("Precio unitario: ");
            double precio=sc.nextDouble();
            sc.nextLine();
//condicional para verificar que la cantidad ingresada sea correcta
            if(cantidad<0 || precio <0){
                System.out.println("Error:cantidad y precio deben ser positivos.");
                i--;
                continue;
            }
            double subtotal=cantidad*precio;
            System.out.println("Subtotal: "+nombre+" -> $"+subtotal);

            Cant_Total+=subtotal;
        }
        //mensaje final
        System.out.println("  \nTotal de la compra: "+Cant_Total);
        sc.close();
    }
}

