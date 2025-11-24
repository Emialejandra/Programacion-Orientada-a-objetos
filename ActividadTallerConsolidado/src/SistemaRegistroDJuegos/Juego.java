package SistemaRegistroDJuegos;

public abstract class Juego {
    protected String nombre;
    protected int anio;
    protected int capacidadDJugadores;

    public Juego(String nombre, int anio, int capacidadDJugadores) {
        this.nombre = nombre;
        this.anio = anio;
        this.capacidadDJugadores = capacidadDJugadores;
    }
    // gets y sets
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws DatosInvalidos {
        if(nombre.trim().isEmpty()){
            throw new DatosInvalidos("El nombre es obligatorio");
        }
            this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) throws DatosInvalidos {
        if(anio<1980 || anio>2025){
            throw new DatosInvalidos("El anio no es valido");
        }
        this.anio = anio;
    }
    public int getCapacidadDJugadores() {
        return capacidadDJugadores;
    }
    public void setCapacidadDJugadores(int capacidadDJugadores) throws DatosInvalidos {
        if (capacidadDJugadores<1){
            throw new DatosInvalidos("Debe ingresar al menos un jugador");
        }
        this.capacidadDJugadores = capacidadDJugadores;
    }

    // metodo abstracto
    public abstract void Descripciones();
}
