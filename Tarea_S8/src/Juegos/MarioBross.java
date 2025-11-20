package Juegos;
public class MarioBross extends Juego {
    private String  personajePrincipal;
    private int mundos;
    public MarioBross(String nombre, int anioLanzamiento, String plataforma,
                      String personajePrincipal, int mundos) throws DatosInvalidos {
        super(nombre, anioLanzamiento,plataforma);
        setPersonajePrincipal(personajePrincipal);
        setMundos(mundos);
    }
    public String getPersonajePrincipal() {
        return personajePrincipal;
    }
    public void setPersonajePrincipal(String personajePrincipal) throws DatosInvalidos {
        if(personajePrincipal == null || personajePrincipal.trim().isEmpty()){
            throw new DatosInvalidos("El personaje no deb ser vacio.");
        }
        this.personajePrincipal = personajePrincipal;
    }
    public int getMundos() {
        return mundos;
    }
    public void setMundos(int mundos) throws DatosInvalidos {
        if (mundos < 0 || mundos > 100) {
            throw new DatosInvalidos("El mundo debe ser mayor a 0 y menor a 100");
        }
        this.mundos = mundos;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("    MARIO BROSS   ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Año Lanzamiento: "+anioLanzamiento);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Personaje Principal: "+personajePrincipal);
        System.out.println("Número de Mundos: "+mundos+"\n");
    }
}
