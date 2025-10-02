import java.util.Scanner;
public class Requisitos {
    public static void main(String[] args){
        Scanner ct=new Scanner(System.in);
        int edad;
        double altura;
        System.out.println("Requisitos para el cuartel");

        System.out.println("Ingrese su edad:");
        edad=ct.nextInt();
        if(edad<18){
            System.out.println("No cumple");
        }else if(edad>=18){
            System.out.println("Cumple");
        }
        System.out.println("Edad:"+edad);

        System.out.println("Ingrese su estatura:");
        altura=ct.nextDouble();
        if(altura <1.60){
            System.out.println("No cumple");
        } else if (altura >=1.60) {
            System.out.println("Cumple");
        }
        System.out.println("Altura:"+altura);


    }
}
