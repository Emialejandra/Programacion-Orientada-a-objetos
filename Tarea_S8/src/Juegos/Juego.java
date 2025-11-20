package Juegos;

public abstract class Juego {
    protected String nombre;
    protected int anioLanzamiento;
    protected String plataforma;

    public Juego(String nombre, int anioLanzamiento, String plataforma)throws DatosInvalidos {
        setNombre(nombre);
        setAnioLanzamiento(anioLanzamiento);
        setPlataforma(plataforma);
    }
    public String getNombre() {
        return nombre;
    }
   public  int getAnioLanzamiento() {
        return anioLanzamiento;
   }
   public String getPlataforma() {
        return plataforma;
   }
// validaciones dentro de los set
   public void setNombre(String nombre) throws DatosInvalidos {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new DatosInvalidos("El nombre es obligatorio");
        }
        this.nombre = nombre;
   }
   public void setAnioLanzamiento(int anioLanzamiento) throws DatosInvalidos {
        if(anioLanzamiento <1980){
            throw new DatosInvalidos("El año de lanzamiento debe ser mayor a 1980");
       }
        this.anioLanzamiento = anioLanzamiento;
   }
   public void setPlataforma(String plataforma) throws DatosInvalidos {
        if(plataforma == null || plataforma.trim().isEmpty()){
            throw new DatosInvalidos("La plataforma debe ser insertada obligatoriamente");
        }
        this.plataforma = plataforma;
   }
   public abstract void mostrarDetalles();
}
