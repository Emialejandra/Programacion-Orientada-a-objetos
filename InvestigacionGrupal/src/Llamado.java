public class Llamado {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        System.out.println("Antes: " + persona1.edad); // 25

        persona1.cumplirAnios(); // Se pasa por referencia
        System.out.println("Después: " + persona1.edad); // 26
    }
}
