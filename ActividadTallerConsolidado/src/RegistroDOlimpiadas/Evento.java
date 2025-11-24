package RegistroDOlimpiadas;

import java.util.ArrayList;

public class Evento {
    private String nombreEvento;
    private String categoria;
    private ArrayList<Participante> participantes;

    public Evento(String nombreEvento, String categoria) {
        this.nombreEvento = nombreEvento;
        this.categoria = categoria;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        for (Participante p : participantes) {
            System.out.println("ID: " + p.getId() + " - Nombre: " + p.getNombre() +
                    " - Tipo: " + p.mostrarTipo());
        }
    }

    public String getNombreEvento() { return nombreEvento; }
    public String getCategoria() { return categoria; }
}
