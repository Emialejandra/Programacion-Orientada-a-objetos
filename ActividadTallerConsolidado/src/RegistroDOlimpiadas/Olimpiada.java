package RegistroDOlimpiadas;

import java.util.ArrayList;

public class Olimpiada {
    private String nombre;
    private int anio;
    private String ciudad;
    private ArrayList<Evento> eventos;

    public Olimpiada(String nombre, int anio, String ciudad) {
        this.nombre = nombre;
        this.anio = anio;
        this.ciudad = ciudad;
        this.eventos = new ArrayList<>();
    }
    public void agregarEvento(Evento e) {
        eventos.add(e);
    }
    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        for (Evento e : eventos) {
            System.out.println("- Evento: " + e.getNombreEvento() +
                    " | Categoría: " + e.getCategoria());
        }
    }
    public ArrayList<Evento> getEventos() {
        return eventos;
    }
}
