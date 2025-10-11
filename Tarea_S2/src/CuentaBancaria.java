public class CuentaBancaria {
    //atributos priados
    private String nombreTitular;
    private double saldo;

    //metodo constructor publico
    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    //mostrar informacion
    public void mostrarInformacion(){
        System.out.println("Titular: "+ nombreTitular);
        System.out.println("Saldo: "+ saldo);
        System.out.println("----------------------------");
    }

    //accion depositar saldo (aumenta la cantidad ingresada)
    public void depositar(double monto){
        if(monto > 0){
            saldo+=monto;
            System.out.println("El saldo depositado: $" +monto);
        }else{
            System.out.println("El saldo debe ser positivo.");
        }
        System.out.println("____________________________");
    }

    //accion retirar (disminuye el valor)
    public void sacar(double monto){
        if(monto>0 && monto <=saldo){
            saldo-=monto;
            System.out.println("El saldo retirado: $" +monto);
        }else if(monto > saldo){
            System.out.println("No hay suficiente saldo para realizar el retiro.");
        }else{
            System.out.println("El monto a retirar debe ser positivo.");
        }
        System.out.println("____________________________");
    }
}
