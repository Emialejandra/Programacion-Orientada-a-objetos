import java.util.Scanner;

public class Artista {
    //atributos
    private String nombre;
    private String genero;
    private int seguidores;

    //contructor vacio
    public Artista(){
    }
    //constructor con parametros
    public Artista(String nombre,String genero,int seguidores){
        this.nombre=nombre;
        this.genero=genero;
        this.seguidores=seguidores;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre==null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        if(genero==null || genero.trim().isEmpty()){
            System.out.println("El genero no puede estar vacio");
        }else {
            this.genero = genero;
        }
    }
    public int getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(int seguidores) {
        if(seguidores < 0){
            System.out.println("El valor de los seguidores no puede ser negativo.");
        }else{
            this.seguidores = seguidores;
        }
    }

    //metodo mostrar
    void MostrarPerfil(){
        System.out.println("-PERFIL DEL ARTISTA-");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("Seguidores: "+getSeguidores()+" mil/millones");
    }

    //metodo ganar seguidores
    void ganarSeguidores(int cantidad){
        if(cantidad>0){
            seguidores+=cantidad;
            System.out.println("Felicidades ganaste "+cantidad+" seguidores.");
            System.out.println("Total de seguidores: "+seguidores+" mil/millones");
        }else{
            System.out.println("La cantidad debe ser positiva.");
        }
    }

}

