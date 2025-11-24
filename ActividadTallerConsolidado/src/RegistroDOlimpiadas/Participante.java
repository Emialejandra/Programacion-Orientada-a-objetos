package RegistroDOlimpiadas;

public abstract class Participante {
    protected int id;
    protected String nombre;

    public Participante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

// metodo abstracto
    public abstract String mostrarTipo();
}


