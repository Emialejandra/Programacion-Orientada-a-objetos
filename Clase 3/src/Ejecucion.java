import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner pd = new Scanner(System.in);
        //producto usando MC sin parametros
        System.out.println("MC sin parametros");
        Producto prod1 = new Producto();
        prod1.mostraInfo();
        prod1.calcularTotal();
        System.out.println(+prod1.);

        System.out.println("___________________");
//MC usando MC con parametros
        System.out.println("\nMC con parametros.");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = pd.nextLine();

        System.out.println("Ingrese el codigo del producto: ");
        int codigo = pd.nextInt();

        System.out.println("Ingrese el precio del producto: ");
        double precio = pd.nextDouble();


        System.out.println("Ingrese la cantidad en stock:");
        int stock = pd.nextInt();
//creamos el objeto y llamamos al MP
        Producto prod2=new Producto(nombre, codigo,precio, stock);
        prod2.mostraInfo();
        prod2.calcularTotal();




    }
}
