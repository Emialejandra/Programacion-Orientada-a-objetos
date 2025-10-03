
import java.util.Scanner;
public class Clase2Ej1 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
       /* String usuario = "emilia";
        String contraseña = "tana";
        String usuario2, clave;*/

        /*System.out.println("Ingrese su usuario: ");
                usuario2=ad.nextLine();
                System.out.println("Ingrese su contraseña: ");
                clave=ad.nextLine();
                
                if(usuario.equals(usuario2) && contraseña.equals(clave)){
                    System.out.println("Acceso concedido");
                }else{
                    System.out.println("Credenciales incorrectas");
                }*/
        //tabla de multiplicar con for
        /*Scanner ml=new Scanner(System.in);
        int numero;

        System.out.println("Tabla de multiplicar.");
        System.out.println("Ingrese el numero");
        numero=ml.nextInt();

        for (int i=1;i<=10;i++) {
            System.out.println(numero+"*"+i+"="+(numero*i));
        }*/

        //hacer un bucle para hacer validas las credenciales

       /* int contador = 0;
        while (contador <= 3) {
            System.out.println("Ingrese su usuario: ");
            usuario2 = ad.nextLine();
            System.out.println("Ingrese su contraseña: ");
            clave = ad.nextLine();

            if (usuario.equals(usuario2) && contraseña.equals(clave)) {
                System.out.println("Acceso concedido");
                return;
            } else {
                System.out.println("Credenciales incorrectas");
            }
        }*/
        //aplicando switch
        int opcion;
        System.out.println("Opciones:\n1.Login\n2.Tabla de multiplicar");
        System.out.println("Ingrese su opcion:");
        opcion = ad.nextInt();

        switch (opcion) {
            case 1:
                String usuario = "emilia";
                String contraseña = "tana";
                String usuario2, clave;

                int contador = 0;
                while (contador <= 3) {
                    System.out.println("Ingrese su usuario: ");
                    usuario2 = ad.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    clave = ad.nextLine();

                    if (usuario.equals(usuario2) && contraseña.equals(clave)) {
                        System.out.println("Acceso concedido");
                        return;
                    } else {
                        System.out.println("Credenciales incorrectas");
                    }
                }

            case 2:
                Scanner ml=new Scanner(System.in);
                int numero;

                System.out.println("Tabla de multiplicar.");
                System.out.println("Ingrese el numero");
                numero=ml.nextInt();

                for (int i=1;i<=10;i++) {
                    System.out.println(numero+"*"+i+"="+(numero*i));
                }

        }

    }
}