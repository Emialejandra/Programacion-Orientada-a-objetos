public class Persona {
    public String nombre;
    public int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void cumplirAnios() {
        this.edad += 1;
    }
}
