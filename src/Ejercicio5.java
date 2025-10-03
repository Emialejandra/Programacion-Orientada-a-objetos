import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner val=new Scanner(System.in);
        float base=0, altura=0;
        float area=0;

        System.out.println("Ingrese la base del triangulo: ");
        base=val.nextFloat();
        System.out.println("Ingrese la altura del triangulo: ");
        altura=val.nextFloat();
        area=(base*altura)/2;
        System.out.println("El area del triangulo es: "+area);



    }

}
