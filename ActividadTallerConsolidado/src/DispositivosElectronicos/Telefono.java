package DispositivosElectronicos;

public class Telefono extends Dispositivo {
    private String sistemaOperativo;

    public Telefono(String marca, String modelo, double precio, String sistemaOperativo)
            throws DatoInvalidoExceptions {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" Teléfono");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Sistema Operativo: " + sistemaOperativo+"\n");
    }
}
