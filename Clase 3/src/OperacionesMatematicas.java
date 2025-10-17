public class OperacionesMatematicas {
    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public int getNumero3(){
        return numero3;
    }

    //metodo operacion matematica
    void operacionMatematica(){
        //calcular
        int suma;
        suma=numero1+numero2+numero3;
        System.out.println("El resultado es: "+suma);
    };

    //mc objeto 1
    public OperacionesMatematicas(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    //MC objeto 2
    public OperacionesMatematicas(int numero1, int numero2, int numero3){
        this.numero1=numero1;
        this.numero2=numero2;
        this.numero3=numero3;
    }
}
