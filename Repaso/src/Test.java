import javax.swing.*;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
            //instancia
            Scanner sc = new Scanner(System.in);
            Area a= new Area();
            System.out.println("Menu");
            System.out.println("1.Cuadrado\n2.Rectangulo\n3.Trapecio");
            System.out.println("Seleccione una opcion: ");
            int opcion = sc.nextInt();

            if (opcion==1){
                System.out.println("Ingrese el lado del cuadrado:");
                double lado =Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese lado del cuadrado:"));
                //System.out.printf("El area es:"+a.calcularArea(lado));
                JOptionPane.showMessageDialog(null,"El area es: "+a.calcularArea(lado));
            }else if (opcion==2){
                System.out.println("Ingrese los lados del rectangulo:");
                System.out.println("Lado 1");
                double lado = sc.nextDouble();
                System.out.println("Lado 2");
                double lado2=sc.nextDouble();
                System.out.printf("El area es:"+a.calcularArea(lado,lado2));
            }else if (opcion==3){
                System.out.println("Ingrese los lado del trapecio:");
                System.out.println("Lado 1");
                double lado = sc.nextDouble();
                System.out.println("Lado 2");
                double lado2=sc.nextDouble();
                System.out.println("lado 3");
                double lado3=sc.nextDouble();
                System.out.printf("El area es:"+a.calcularArea(lado,lado2,lado3));
            }

        }
    }

