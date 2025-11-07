public class Persona {
    //para que una clase no sea heredada se utilisa FINAL
    String cedula;
    String nombre;
    int edad;

    //creamos un metodo constructor
    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        }

        public void imprimir(){
            System.out.println("Datos Personales");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + this.edad);
            System.out.println("Cedula: " + this.cedula);
        }


    //USAMOS 'public final class Persona' PARA QUE LA CLASE PADRE NO DE HERENCIA

}

