package EleccionDeLaReinaDeQuito;

public class CandidataEstudiante extends Candidata {
    // atributos
    private String universidad;
    private String carrera;

    public CandidataEstudiante(int ID, String nombre, int edad, String distrito, float puntaje, String universidad, String carrera ) {
        super(ID, nombre, edad, distrito, puntaje);
        this.carrera = carrera;
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setUniversidad(String universidad) throws DatosInvalidosException{
        if(universidad == null ||  universidad.trim().isEmpty()){
            throw new DatosInvalidosException("La universidad no debe estar vacia.");
        }
        this.universidad = universidad;
    }
    public void setCarrera(String carrera) throws DatosInvalidosException {
        if(carrera == null || carrera.trim().isEmpty()){
            throw new DatosInvalidosException("La carrera no debe estar vacia.");
        }
        this.carrera = carrera;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("CANDIDATA ESTUDIANTE");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Distrito: " + distrito);
        System.out.println("Puntaje: " + puntaje);
        System.out.println("Universidad: " + universidad);
        System.out.println("Carrera: " + carrera);

    }
}
