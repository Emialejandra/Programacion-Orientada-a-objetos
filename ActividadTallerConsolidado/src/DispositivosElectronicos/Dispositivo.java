package DispositivosElectronicos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) throws DatoInvalidoExceptions{
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    // get y set con validaciones
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) throws DatoInvalidoExceptions {
        if (marca == null || marca.trim().isEmpty()) {
            throw new DatoInvalidoExceptions("La marca no puede estar vacía.");
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
    public void setPrecio(double precio) throws DatoInvalidoExceptions {
        if (precio < 0) {
            throw new DatoInvalidoExceptions("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    public void mostrarInformacion() {
        System.out.println("Dispositivos.Dispositivo genérico.");
    }
}
