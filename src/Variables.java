import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("La variable entera: ");
        num=sc.nextInt();


        double val2;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("La variable double");
        val2= sc2.nextDouble();

        char caracter;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Caracter ");
        caracter=sc3.next().charAt(0);


        String Apodo;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Variable string" );
        Apodo=sc4.nextLine();


        boolean bool=true;
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Variable booleana ");
        bool=sc5.nextBoolean();
    }
}
