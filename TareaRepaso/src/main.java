import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner art=new Scanner(System.in);
        Artista artista1=new Artista("Enrique Bunbury","Masculino",30);
        artista1.ganarSeguidores(100);
        artista1.MostrarPerfil();

        


        Artista artista2=new Artista();
        System.out.println("\nInformacion del artista.");
        System.out.println("Ingrese el nombre del artista: ");
        artista2.setNombre(art.nextLine());
        System.out.println("Ingrese el genero del artista: ");
        artista2.setGenero(art.nextLine());
        System.out.println("Ingrese el numero de seguidores: ");
        artista2.setSeguidores(art.nextInt());
        System.out.println("Resumen del  artista.");
        artista2.MostrarPerfil();
        System.out.println("Ingrese la cantidad de nuevos seguidores: ");
        artista2.setSeguidores(art.nextInt());




    }
}
