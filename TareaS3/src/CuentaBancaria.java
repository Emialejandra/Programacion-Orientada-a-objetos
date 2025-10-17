public class CuentaBancaria {
    private double saldo = 0;
    private String titular;

    //MC
    public CuentaBancaria(String titular){
        this.titular=titular;
    }

    //depositar dinero
    public void Depositar(double valor){
        if(valor >0 ){
            saldo+=valor;
            System.out.println("Deposito realizado exitosamente: "+valor);
        }else{
            System.out.println("Valor no valido.");
        }
    }

    //retirar dinero
    public void Retiro(double valor){
        if(valor >0){
            if(valor<=saldo){
                saldo-=valor;
                System.out.println("Retiro realizado exitosamente: "+valor);
            }else{
                System.out.println("Valor no valido.");
            }
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //visualizar saldo
    public double getSaldo(){
        return saldo;
    }
    //obtener titular
    public String getTitular(){
        return titular;
    }


}


