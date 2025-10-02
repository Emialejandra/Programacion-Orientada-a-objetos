import java.util.Scanner;

public class matematicas {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner dg=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1=dg.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2=dg.nextInt();

        int Suma=numero1+numero2;
        int Resta=numero1-numero2;
        int Multiplicacion=numero1*numero2;
        int Division=numero1/numero2;
        int Modulo=numero1%numero2;
        System.out.println("Suma: "+Suma);
        System.out.println("Resta: "+Resta);
        System.out.println("Multiplicacion: "+Multiplicacion);
        System.out.println("Division: "+Division);
        System.out.println("Modulo: "+Modulo);


    }
}
