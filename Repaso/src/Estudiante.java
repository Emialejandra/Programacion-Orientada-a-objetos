public class Estudiante {
    //atributos
    private String codigo="A001";
    private String nombre="Juan Perez";
    private String carrera="Desarrollo de software";
    private int semestre=3;

    //get leer y set modificar
    public void xyz(String X){
        this.nombre=X;
    }

    //metodos mostrar
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                '}';
    }
    public void saludar(){
        System.out.println("Holaa");
    }
    public void saludar(String nombre){
        System.out.println("Buenas Tardes "+nombre);
    }
    public void saludar(int dias){
        System.out.println("Cuantas clases de POO tienes a la semana ? "+dias);
    }
}
