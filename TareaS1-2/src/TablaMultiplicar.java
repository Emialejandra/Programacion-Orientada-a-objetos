import java.util.Scanner;
public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner ml = new Scanner(System.in); //objeto
        //variable
        int numero;

        //pedido de datos y leido
        System.out.println("Tabla de multiplicar.");
        System.out.println("Ingrese el numero");
        numero = ml.nextInt();
        ml.nextLine();

        //condicional para crear la tabla
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "*" + i + "=" + (numero * i));
        }
        ml.close();
    }
}

