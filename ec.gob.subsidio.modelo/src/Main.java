package ec.gob.subsidio.main;
import ec.gob.subsidio.modelo.SolicitanteSubsidio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //objeto Scanner
        Scanner solicitante=new Scanner(System.in);

        //mostrar reglas
        SolicitanteSubsidio.mostrarReglasSubsidio();
        //recoleccion de datos
        System.out.print("Ingrese su nombre completo: ");
        String nombre = solicitante.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = solicitante.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = solicitante.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos: ");
        int vehiculos = solicitante.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = solicitante.nextBoolean();

        //objeto de metodo constructor
        SolicitanteSubsidio SS=new SolicitanteSubsidio(nombre, cedula, ingresos,vehiculos, viveEnEcuador);

        //mostrar datos
        System.out.println(SS.toString());
        //mostrar resultados
        SS.generarResultado();


        //consumo mensual
        double consumoNormal = SS.calcularConsumoMensual();
        double consumoExtra = SS.calcularConsumoMensual(80.0); // ejemplo

        System.out.println("Consumo mensual normal: " + consumoNormal + " L");
        System.out.println("Consumo mensual con km extra: " + consumoExtra + " L");


    }
}
