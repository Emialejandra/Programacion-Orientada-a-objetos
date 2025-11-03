package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    //atributos privados
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    //metodo constructor que recibe los atributos
    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    //metodos get y set
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }
    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        }else {
            System.out.println("Los ingresos no pueden ser menos de 470");
        }
    }
    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        }else {
            this.cantidadVehiculos = 0;
        }
    }
    public boolean getViveEnEcuador() {
        return viveEnEcuador;
    }
    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    //otros metodos
    public boolean subsidioAprobado(){
        boolean cumpleIngresos=this.ingresosMensuales<=1200;
        boolean cumpleVehiculos=this.cantidadVehiculos<=1;
        boolean cumpleResidencia=this.viveEnEcuador;

        return cumpleIngresos && cumpleVehiculos && cumpleResidencia;
    }

    public void generarResultado(){
        System.out.println("\nResultado de su solicitud");
        if(subsidioAprobado()){
            System.out.println("Subsidio Aprobado, Usted cumple con los requisitos.");
        }else{
            System.out.println("Subsitio rechazado. No cumple con los requisitos.");

            //motivos
            if (this.ingresosMensuales>=1200) {
                System.out.println("Sus ingresos exceden el limite de $1,200");
            }
            if (this.cantidadVehiculos>=1) {
                System.out.println("Posee más de un vehiculo registrado.");
            }
            if (this.viveEnEcuador) {
                System.out.println("No reside en Ecuador (requisito obligatorio)");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "\nDATOS DEL SOLICITANTE \n" +
                "NombreCompleto: " + nombreCompleto + '\n' +
                "Cedula: " + cedula + '\n' +
                "IngresosMensuales: " + ingresosMensuales + '\n'+
                "CantidadVehiculos: " + cantidadVehiculos + '\n'+
                "ViveEnEcuador: " + viveEnEcuador;
    }

    //metodo para mostrar las reglas
    public static void mostrarReglasSubsidio() {
        System.out.println("Reglas para obtener el subsidio");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer más de un vehículo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println();
    }

    public double calcularConsumoMensual() {
        double consumo=400.0/40.0;
        return consumo;
    }
    public double calcularConsumoMensual(double kmExtra) {
        double consumo=(400.0+kmExtra)/40.0;
        return consumo;
    }
}
