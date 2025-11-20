package Dispositivos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) throws DatoInvalido{
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    // get y set con validaciones
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) throws DatoInvalido {
        if (marca == null || marca.trim().isEmpty()) {
            throw new DatoInvalido("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo; // Modelo puede ser vacío o cualquier texto
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) throws DatoInvalido {
        if (precio < 0) {
            throw new DatoInvalido("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    public void mostrarInformacion() {
        System.out.println("Dispositivos.Dispositivo genérico.");
    }
}
