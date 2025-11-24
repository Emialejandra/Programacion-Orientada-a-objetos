package SistemaRegistroDJuegos;

public class CarreraVehiculos extends Juego{
    private String tipoVehiculo;
    private String terreno;

    //constructor
    public CarreraVehiculos(String nombre, int anio, int capacidadDJugadores, String tipoVehiculo, String terreno) {
        super(nombre, anio, capacidadDJugadores);
        this.tipoVehiculo = tipoVehiculo;
        this.terreno = terreno;
    }
    // set y get
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo) throws DatosInvalidos {
        if (tipoVehiculo.trim().isEmpty()){
            throw new DatosInvalidos("Ingrese un tipo de vehiculo.");
        }
        this.tipoVehiculo = tipoVehiculo;
    }
    public String getTerreno() {
        return terreno;
    }
    public void setTerreno(String terreno) throws DatosInvalidos {
        if (terreno.trim().isEmpty()){
            throw new DatosInvalidos("Ingrese un terreno.");
        }
        this.terreno = terreno;
    }
// sobreescritura
    @Override
    public void Descripciones(){
        System.out.println("CarreraVehiculos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Anio: " + anio);
        System.out.println("Capacidad DJugadores: " + capacidadDJugadores);
        System.out.println("Tipo de vehiculo: " + tipoVehiculo);
        System.out.println("Terreno: " + terreno);
    }

}
