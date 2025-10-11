public class Libro {

    //atributos
    String titulo;
    String autor;
    int  anioPublicacion;

    //metodo constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //metodo propio para mostrar informacion
    public void mostrarInformacion(){

        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+ anioPublicacion);
        System.out.println("___________________________________");
    }

    //metodo para ejecutar el programa
    public static void main(String[] args){
        System.out.println("Sistema de información de libros.\n");
        //creamos 2 objetos
        Libro libro1 =new Libro("Teoría del desencanto", "Raúl Pérez Torres",1985);
        Libro libro2=new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        //mostrar informacion
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }

}
