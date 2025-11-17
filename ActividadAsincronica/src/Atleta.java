public class Atleta extends Participante{
    private String deporte;

    public Atleta(int id, String nombre, String deporte) {
        super(id, nombre);
        this.deporte = deporte;
    }

    public String getDeporte() { return deporte; }
    public void setDeporte(String deporte) { this.deporte = deporte; }

    @Override
    public String mostrarTipo() {
        return "Atleta - Deporte: " + deporte;
    }
}
