public class main {
    public static void main() {

        Persona per1 = new Persona();
        per1.setNombre("Emilia");
        per1.setEdad(20);
        per1.setProfesion("Estudiante");
        per1.mostraInformacion();

        System.out.println("--------------------\n");
        Persona per2=new Persona();
        per2.setNombre("");
        per2.setEdad(-20);
        per2.setProfesion("Ninguna");
        per2.mostraInformacion();

    }
}
