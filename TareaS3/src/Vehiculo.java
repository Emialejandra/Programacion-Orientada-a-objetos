public class Vehiculo {
    //atributos
    public String marca;
    private String modelo;  //get y set
    private double velocidadMax; //get
    private int codigoSeguridad;  //set
    private String color;  //get y set 'rojo','azul' o 'blanco'

    //metodos get y set segun el caso
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("rojo")) {
            this.color = "rojo";
        } else if (color.equals("azul")) {
            this.color = "azul";
        } else if (color.equals("blanco")) {
            this.color = "blanco";
        } else {
            System.out.println("color invalido");
        }
    }

    //MC
    public Vehiculo(String marca, String modelo, double velocidadMax, int codigoSeguridad, String color) {
        this.marca = marca;
        setModelo(modelo);
        this.velocidadMax = 200;
        setCodigoSeguridad(codigoSeguridad);
        setColor(color);
    }

}
