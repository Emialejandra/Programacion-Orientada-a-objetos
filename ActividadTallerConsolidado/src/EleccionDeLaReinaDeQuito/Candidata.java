package EleccionDeLaReinaDeQuito;

public abstract class Candidata {
    // atributos
    protected int ID;
    protected String nombre;
    protected int edad;
    protected String distrito;
    protected float puntaje;

    public Candidata(int Id, String nombre, int edad, String distrito, float puntaje) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.puntaje = puntaje;
        this.distrito = distrito;
    }

    // gets y set
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws DatosInvalidosException{
        if (nombre==null || nombre.trim().isEmpty()){
            throw new DatosInvalidosException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws DatosInvalidosException{
        if (edad <=16){
            throw new DatosInvalidosException("La edad del participante debe ser mayor a 16 años");
        }
        this.edad = edad;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) throws DatosInvalidosException{
        if(distrito==null || distrito.trim().isEmpty()){
            throw new DatosInvalidosException("El distrito es obligatorio");
        }
        this.distrito = distrito;

    }
    public float getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(float puntaje) throws DatosInvalidosException{
        if(puntaje <0 || puntaje > 100){
            throw new DatosInvalidosException("El puntaje debe ser entre 0 y 100");
        }
        this.puntaje = puntaje;
    }

    //metodo abstracto
    public abstract void mostrarDetalles();
}
