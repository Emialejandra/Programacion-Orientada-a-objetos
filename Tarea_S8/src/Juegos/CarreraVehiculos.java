package Juegos;

public class CarreraVehiculos extends Juego {
    private double velocidad;
    private int niveles;

    public CarreraVehiculos(String nombre, int anioLanzamiento, String plataforma,
                            double velocidad,int niveles) throws DatosInvalidos {
        super(nombre, anioLanzamiento, plataforma);
        setVelocidad(velocidad);
        setNiveles(niveles);
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) throws DatosInvalidos {
        if(velocidad < 0 || velocidad > 1000) {
            throw new DatosInvalidos("La velocidad no debe ser mayor a 200 km/h");
        }
        this.velocidad = velocidad;
    }
    public int getNiveles() {
        return niveles;
    }
    public void setNiveles(int niveles) throws DatosInvalidos {
        if(niveles < 0 || niveles > 200) {
            throw new DatosInvalidos("El nivel deber ser mayor a 0");
        }
        this.niveles = niveles;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("    CARRERA DE VEHICULOS   ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Año Lanzamiento: "+anioLanzamiento);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("VVelocidad: "+velocidad);
        System.out.println("Niveles: "+niveles+"\n");
    }
}
