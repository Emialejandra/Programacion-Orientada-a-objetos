public class Persona {
    public int cedula;
    public String nombre;
    public int edad;
    public String correo;
    private float ahorros;

    //M C sin parametros y datos quemados
    public Persona() {      //el mc no recibe nada porq los parametros estan vacios+687

        cedula=1712496403;
        nombre="Emila";
        edad=20;
        correo="e.t@gmail.com";
        ahorros=5000;
    }
//metodo propio
    void visualizarDatos(){
        System.out.println("Ahorro disponible "+ahorros);
    }


}

