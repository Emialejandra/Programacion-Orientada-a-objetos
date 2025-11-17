public class Equipo extends Participante{
    private String pais;
    private int numIntegrantes;

    public Equipo(int id, String nombre, String pais, int numIntegrantes) {
        super(id, nombre);
        this.pais = pais;
        this.numIntegrantes = numIntegrantes;
    }

    public String getPais() { return pais; }
    public int getNumIntegrantes() { return numIntegrantes; }

    public void setPais(String pais) { this.pais = pais; }
    public void setNumIntegrantes(int numIntegrantes) { this.numIntegrantes = numIntegrantes; }

    @Override
    public String mostrarTipo() {
        return "Equipo - País: " + pais + ", Integrantes: " + numIntegrantes;
    }
}
