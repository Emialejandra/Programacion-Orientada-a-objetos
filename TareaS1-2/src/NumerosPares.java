import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args){
        Scanner par=new Scanner(System.in); //objeto
        //variables
        int cantidad, numero;
        int contador=0;

        //cadena de texto
        System.out.print("¿Cuántos números desea ingresar?: ");
        cantidad = par.nextInt();
        par.nextLine();

        // Bucle for para leer cada número
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = par.nextInt();
            par.nextLine();

            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Se ingresaron " + contador+ " números pares.");
        par.close();
    }
}

