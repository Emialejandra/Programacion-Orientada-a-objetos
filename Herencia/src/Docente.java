public class Docente extends Persona {
    String materia;

    public Docente(String cedula, String nombre, int edad,String materia) {
        super(cedula, nombre, edad); //utilizamos super para no inicializar nuevamente los atributos
        this.materia = materia;
    }

    public void imprimirDocente(){
        super.imprimir();
        System.out.println("Materia: " + this.materia);
    }
}
