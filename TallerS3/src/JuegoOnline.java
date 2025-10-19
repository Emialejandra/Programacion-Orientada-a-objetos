public class JuegoOnline {

    private int nivel=1;

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        if(nivel >=0){
            this.nivel = nivel;
        }else{
            System.out.println("\nEl nivel no puede ser negativo. Se mantiene el nivel actual");
        }
    }

}
