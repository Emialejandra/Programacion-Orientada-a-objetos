package Dispositivos;

public class Laptop extends Dispositivo{
    private int cantidadMemoria;
    public Laptop(String marca, String modelo, double precio, int cantidadMemoria) throws DatoInvalido{
        super(marca, modelo, precio);
        this.cantidadMemoria = cantidadMemoria;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println(" Laptop");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Cantidad de memoria: " + cantidadMemoria + " GB\n");
    }
}
