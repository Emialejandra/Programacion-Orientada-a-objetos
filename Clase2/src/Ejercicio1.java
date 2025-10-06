import java.util.Scanner;
public class Ejercicio1 {
    //atributos
    String nombre;
    String posicion;
    int edad;
    int N_Camiseta;

    public Ejercicio1( String posicion,int N_Camiseta) {  //metodo constructor
        this.posicion = posicion;
        this.N_Camiseta=N_Camiseta;
    }

    void Registro(){

        System.out.println("Posición: "+posicion);
        System.out.println("Numero de camiseta: "+N_Camiseta);
    }

    public static void main(String[] args) {

        Scanner jugador = new Scanner(System.in);
        //variables
        String nombre;
        int edad;

        System.out.println("Registro de jugadores.");
        //jugador1
        System.out.println("Ingrese su nombre: ");
        nombre=jugador.nextLine();
        System.out.println("Ingrese su edad: ");
        edad =jugador.nextInt();
        jugador.nextLine();
        Ejercicio1 jugador1=new Ejercicio1("Medio campista",20);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        jugador1.Registro();

        //jugador 2
        System.out.println("\nIngrese su nombre: ");
        nombre=jugador.nextLine();
        System.out.println("Ingrese su edad: ");
        edad =jugador.nextInt();
        jugador.nextLine();
        Ejercicio1 jugador2=new Ejercicio1("Central",12);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        jugador2.Registro();

    }
}


