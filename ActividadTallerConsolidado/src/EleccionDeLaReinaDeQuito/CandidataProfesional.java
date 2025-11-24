package EleccionDeLaReinaDeQuito;

public class CandidataProfesional extends Candidata {
    private String profesion;
    private int aniosExperiencia;

    public CandidataProfesional(int ID, String nombre, int edad, String distrito, float puntaje,  String profesion,  int aniosExperiencia) {
        super(ID, nombre, edad, distrito, puntaje);
        this.aniosExperiencia = aniosExperiencia;
        this.profesion = profesion;
    }
    public String getProfesion() {
        return profesion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) throws DatosInvalidosException{
        if(aniosExperiencia <=2){
            throw new DatosInvalidosException("Debe tener al menos dos años de experiencia");
        }
        this.aniosExperiencia = aniosExperiencia;
    }
    public void setProfesion(String profesion) throws DatosInvalidosException{
        if(profesion == null || profesion.trim().isEmpty()){
            throw new DatosInvalidosException("Debe ingresar una profesion");
        }
        this.profesion = profesion;
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("ID: "+ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Distrito: " + distrito);
        System.out.println("Puntaje: " + puntaje);
        System.out.println("Profesion: " + profesion);
        System.out.println("AniosExperiencia: " + aniosExperiencia);
    }

}
