public class MAIN {
    public static void main(String[] args) {
        System.out.println("Banco del Proceso.\nTú BANCO de confianza.\n");
        //creamos el objeto tipo CuentaBancaria
        CuentaBancaria cuenta1=new CuentaBancaria("Luiz Tabango",5000);
        CuentaBancaria cuenta2=new CuentaBancaria("Janeth Calero",250.25);

        //llamado de metodos(acción) en orden logico
        //cuenta numero 1
        System.out.println("Cuenta bancaria 1");
        cuenta1.mostrarInformacion();
        cuenta1.depositar(25.0);
        cuenta1.sacar(125.0);
        cuenta1.mostrarInformacion();

        //cuenta numero 2
        System.out.println("\nCuenta bancaria 2");
        cuenta2.mostrarInformacion();
        cuenta2.sacar(1025.0);
        cuenta2.depositar(200.32);
        cuenta2.mostrarInformacion();
    }
}
