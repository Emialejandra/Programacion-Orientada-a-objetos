public class main {
    public static void main(String[] args) {
        Persona per1 = new Persona("0400989745", "Luis Tana",20);
        per1.imprimir();
        Estudiante est1=new Estudiante("1725930570","Emilia Tana",19,"202320112");
        est1.imprimirEstudiante();
        Docente doc1=new Docente("2223255678","Yadira",40,"POO");
        doc1.imprimirDocente();

    }
}
