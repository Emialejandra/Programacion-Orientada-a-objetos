public class ejecucion {
    public static void main() {
        CuentaBancaria c=new CuentaBancaria("Yadira");

        //intento de modificar el saldo
        /*c.saldo=500;*/

        //deposito
        c.Depositar(500);
        c.Depositar(-30);

        //retiros
        c.Retiro(35);
        c.Retiro(-60);
        c.Retiro(200);

        //mostrar saldo final
        System.out.println("Su saldo final " +c.getTitular()+": "+c.getSaldo());

    }
}
