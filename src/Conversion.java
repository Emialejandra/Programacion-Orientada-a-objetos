import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal:");
        double N_Decimal;
        N_Decimal=sc.nextDouble();
        int N_Entero=(int)  N_Decimal;
        System.out.println("Casting explicito: "+N_Decimal+ "->"+N_Entero);

        System.out.println("Ingrese un numero entero:");
        int N_Entero2;
        N_Entero2=sc.nextInt();
        double N_Decimal2=N_Entero2;
        System.out.println("Casting implicito:"+N_Entero2+"->"+N_Decimal2);

        sc.close();
    }
}
