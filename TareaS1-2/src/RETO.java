import java.util.Scanner;
public class RETO {
    public static void main(String[] args){
        Scanner rt = new Scanner(System.in); //crear el objeto
        //determinacion de variables
        String nombre;
        int edad;
        double altura;

        //pedir y leer los datos
        System.out.println("Ingrese su nombre: ");
        nombre=rt.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=rt.nextInt();
        rt.nextLine();
        System.out.println("Ingrese su altura: ");
        altura=rt.nextDouble();
        rt.nextLine();

        //condicional para la verificacion de aceptado o no aceptado
        if(edad>=18 && altura>=1.60){
            System.out.println("Aceptado para el equipo.");
        }else{
            System.out.println("No cumple los requisitos");
        }
        rt.close();
    }
}
