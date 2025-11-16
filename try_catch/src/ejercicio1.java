import java.util.Scanner;
public class ejercicio1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    try{
        System.out.println("Ingrese el precio del producto: ");
        double precio=Double.parseDouble(sc.nextLine());

        double precioFinal=precio*1.15;
        System.out.println("El precio final conIVA: "+precioFinal);
    }catch (Exception e){
        System.out.println("Error: debe ingrear un número válido.");
    }
}
}
