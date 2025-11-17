import java.util.Scanner;
import java.util.ArrayList;

public class GestionPrecios {
    public static void main(String[] args) {
        //objeto scaner
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precios =new ArrayList<>();
        MetodosPrecios metodo=new MetodosPrecios();

        int opcion =0;

        do{
            System.out.println("\n  MENÚ DE PRECIOS INMOBILIARIOS   ");
            System.out.println("1. Ingresar precio\n2. Mostrar todos los precios");
            System.out.println("3. Mostrar precio más alto\n4. Mostrar precio más bajo");
            System.out.println("5. Mostrar precios iguales\n6. Buscar un precio en especifico");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción: ");

            opcion = sc.nextInt();
            switch(opcion){

                case 1:
                    metodo.ingresarPrecios(sc,precios);
                    break;
                case 2:
                    metodo.mostrarPrecios(precios);
                    break;
                case 3:
                    metodo.precioMasAlto(precios);
                    break;
                case 4:
                    metodo.precioMasBajo(precios);
                    break;
                case 5:
                    metodo.precioIguales(sc,precios);
                    break;
                case 6:
                    metodo.buscarPrecio(sc,precios);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema.\nGracias por preferirnos.");
                    break;
                default        :
                    System.out.println("##La opcion ingresada no existe##");
            }
        } while (opcion!=7);
    }
}
