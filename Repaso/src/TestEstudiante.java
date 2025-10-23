public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        String nuevo=estudiante.toString();
        System.out.println(nuevo);
        estudiante.saludar();
        System.out.println("------------------");
        estudiante.xyz("Nicolas Alejandro");
        nuevo=estudiante.toString();
        System.out.println(nuevo);
        estudiante.saludar("Alex ");
        estudiante.saludar(2);

    }
}
