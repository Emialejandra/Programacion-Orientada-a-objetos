import java.util.Scanner;

public class Producto {
    //definimos los atributos tanto publicos como privados
    public String nombre;
    public int codigo;
    private double precio;
    private int stock;


    //M C sin parametros y con datos quemados
    public Producto(){
        nombre="Pasta de tomate";
        codigo=1216;
        precio=2.25;
        stock=20;
    }

    //M C con parametros
    public Producto(String nombre, int codigo, double precio, int stock) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
        this.stock=stock;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    //MP muestra informacion
    void mostraInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock+" unidades");
    }

    //MP calcular el valor total del stock
    public void calcularTotal(){
        double total=precio*stock;
        System.out.println("El valor total es: "+total);
    }

}
