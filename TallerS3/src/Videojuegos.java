public class Videojuegos {
    private String titulo;
    private String plataforma;
    private double puntuacion;

    public Videojuegos(){
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void mostrar(){
        System.out.printf("Titulo: "+getTitulo()+"\nPlataforma: "+getPlataforma()+"\nPuntuacion: "+getPuntuacion());
    }

}
