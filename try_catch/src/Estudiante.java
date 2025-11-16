public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        if(nombre==null || nombre.isEmpty()){
            throw  new IllegalArgumentException("El nombre es obligatorio:");
        }
        if (edad<0 || edad>120){
            throw new IllegalArgumentException("El edad es obligatoria:");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}

