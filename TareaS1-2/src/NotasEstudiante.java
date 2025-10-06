import java.util.Scanner;
public class NotasEstudiante {
    public static void main(String[]  args){
        Scanner es=new Scanner(System.in);//objeto
        //variables
        String nombre;
        double nota1, nota2, nota3;
        double promedio;
        //pedido y leido de datos
        System.out.println("Ingrese su nombre y apellido: ");
        nombre=es.nextLine();
        System.out.println("Ingrese la primera nota: ");
        nota1=es.nextDouble();
        es.nextLine();
        System.out.println("Ingrese la segunda nota: ");
        nota2=es.nextDouble();
        es.nextLine();
        System.out.println("Ingrese la tercera nota: ");
        nota3=es.nextDouble();
        es.nextLine();

        //cadena de texto
        promedio=(nota1+nota2+nota3)/3;  //calculo del promedio
        System.out.println("Hola "+nombre+" su promedio sobre 10 es: "+promedio);

        //condicional para verificar si aprueba o no
        if(promedio>=7.00){
            System.out.println("   Felicidades usted aprueba");
        }else{
            System.out.println("   Usted no aprueba  :( ");
        }
        es.close();
    }
}
