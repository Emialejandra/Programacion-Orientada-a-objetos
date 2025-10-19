public class Principal {
    public static void main(String[] args) {
        Videojuegos vj = new Videojuegos();
        vj.setTitulo("GOD OF WAR");
        vj.setPlataforma("pc");
        vj.setPuntuacion(150.2);

        vj.mostrar();

        //Parte del personaje
        Personaje p1 = new Personaje();
        p1.setNombrePersonaje("Ares");
        p1.Mostrar();

        //parte de juegoOnline
        JuegoOnline jo =new JuegoOnline();
        jo.setNivel(3);
        System.out.println("Has avanzado al nivel "+jo.getNivel());

        //validacion
        jo.setNivel(-2);
        System.out.println(jo.getNivel());
    }
}
