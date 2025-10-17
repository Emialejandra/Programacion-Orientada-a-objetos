public class Persona {
    //declaramos los atributos
    private String nombre;
    private int edad;
    private String profesion;

    //metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.equals(null)|| nombre.equals("")){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<=0){
            System.out.println("La edad debe ser mayor a '0'.");
        }else{
            this.edad = edad;
        }
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //M.Constructor
    public Persona() {

    }

    //muestra de informacion
    void mostraInformacion(){
        System.out.println("Informacion del persona");
        System.out.println("Nombre: "+getNombre());;
        System.out.println("Edad: "+getEdad());
        System.out.println("Profesion: "+getProfesion());
    }
}
