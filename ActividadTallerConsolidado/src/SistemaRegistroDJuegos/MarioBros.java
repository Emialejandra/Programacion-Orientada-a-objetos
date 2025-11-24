package SistemaRegistroDJuegos;

public class MarioBros extends Juego{
    private int niveles;
    private String personajeFav;

    // constructor
    public MarioBros(String nombre, int anio, int capacidadDJugadores, int niveles, String personajeFav) {
        super(nombre, anio, capacidadDJugadores);
        this.niveles = niveles;
        this.personajeFav = personajeFav;
    }

    // gets y set de la clase hija
    public int getNiveles() {
        return niveles;
    }
    public void setNiveles(int niveles) throws DatosInvalidos {
        if(niveles<1 || niveles >100){
            throw new DatosInvalidos("Ingrese un nivel entre 1 y 100");
        }
        this.niveles = niveles;
    }
    public String getPersonajeFav() {
        return personajeFav;
    }
    public void setPersonajeFav(String personajeFav) throws DatosInvalidos {
        if(personajeFav.trim().isEmpty()){
            throw new DatosInvalidos("Ingrese al menos un nombre.");
        }
        this.personajeFav = personajeFav;
    }

    //sobreescritura del metodo abstracto
    @Override
    public void Descripciones(){
        System.out.println("Mario Bros");
        System.out.println("Nombre: "+nombre);
        System.out.println("Anio: "+anio);
        System.out.println("Capacidad DJugadores: "+capacidadDJugadores);
        System.out.println("Niveles: "+niveles);
        System.out.println("Personaje Fav: "+personajeFav);
    }
}
