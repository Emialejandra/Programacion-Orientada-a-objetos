import java.util.Scanner;
public class estructuraFOR {
    public static void main(String[] args) {
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
