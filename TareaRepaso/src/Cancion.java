public class Cancion {
    //atributos
    private String titulo;
    private double duracion;
    private int reproducciones;

    //constructor vacio
    public Cancion(){
    }

    //constructor con parametros
    public Cancion(String titulo, double duracion, int reproducciones){
        this.titulo = titulo;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }

    //get y set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if(titulo==null || titulo.trim().equals("")){
            System.out.println("El titulo no puede estar vacio.");
        }else {
            this.titulo = titulo;
        }
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        if(duracion>0){
            this.duracion = duracion;
        }else{
        System.out.println("El duracion debe ser de minimo 1 minuto.");
        }
    }
    public int getReproducciones() {
        return reproducciones;
    }
    public void setReproducciones(int reproducciones) {
        if(reproducciones>=0){
            this.reproducciones = reproducciones;
        }else {
            System.out.println("Las reproducciones deben ser positivas.");
        }
    }

    //metodo para aumento de reproducciones
    public void reproducir(){
        reproducciones++;
        System.out.println("Reproduciendo "+getTitulo()+" con "+getReproducciones()+" M producciones.");
    }






}
