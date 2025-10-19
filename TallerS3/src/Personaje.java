public class Personaje {
    //atributo
    private String nombrePersonaje;

    public String getNombrePersonaje(){
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje){
        this.nombrePersonaje = nombrePersonaje;
    }

    void Mostrar(){
        System.out.println("\nNombre Personaje: " + getNombrePersonaje());
    }

}
