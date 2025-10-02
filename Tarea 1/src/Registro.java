import java.util.Scanner;
public class Registro {
    public static void main(String[] args){
        Scanner rg=new Scanner(System.in);

        String nombre, cedula,celular, correo;
        System.out.println("\nRegistro de clientes.");
//ingreso de datos
        System.out.println("Ingrese su nombre: ");
        nombre=rg.nextLine();
        if(nombre.isEmpty()){
            System.out.println("El nombre no puede quedar vacio.");
        }
        System.out.println("Digite su cedula: ");
        cedula=rg.nextLine();
        if(cedula.isEmpty()){
            System.out.println("La cedula debe tener 10 digitos.");
        }
        System.out.println("Digite su numero de telefono: ");
        celular=rg.nextLine();
        if (celular.isEmpty()) {
            System.out.println("El Telefono debe tener 10 digitos.");
        }
        System.out.println("Ingrese su email: ");
        correo=rg.nextLine();
        if (correo.isEmpty()){
            System.out.println("El correo no puede quedar vacio.");
        }

        //ficha
        System.out.println("\nFicha del cliente ingresado.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Telefono: "+celular);
        System.out.println("Correo: "+correo);
    }
}
