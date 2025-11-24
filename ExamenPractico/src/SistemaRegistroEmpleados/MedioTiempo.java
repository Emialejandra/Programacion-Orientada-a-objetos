package SistemaRegistroEmpleados;

public class MedioTiempo extends TechESFOT{
    // atributos
    protected int codigo;
    protected int horas;
    protected String horario;
    private double sueldoTotal;

    // constructor
    public MedioTiempo(int codigo, String nombre, String apellido, String cargo, double sueldoBase, int horas, String horario) {
        super(nombre, apellido, cargo, sueldoBase);
        this.codigo = codigo;
        this.horas = horas;
        this.horario = horario;
    }
    // sets y gets
    public int getHoras(){ return horas; }
    public void setHoras(int horas) throws DatosInvalidos{
        if (horas <5 || horas >8){
            throw new DatosInvalidos("El tiempo ingresado de horas no es correcto.");
        }
        this.horas=horas;
    }

    public String getHorario(){ return horario; }
    public void setHorario(String horario) throws DatosInvalidos{
        if(horario==null || horario.trim().isEmpty()){
            throw new DatosInvalidos("Ingrese su horario (Matutino/Vespertino).");
        }
    }

    // metodo mostrar detalles
    @Override
    public void Detalles(){
        System.out.println("Empleado de Medio Tiempo:");
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Pago por hora: "+getSueldoBase());
        System.out.println("Horas: "+horas);
        System.out.println("Horario: "+horario);
    }
    // metodo calcular sueldo total

    public void CalcularSueldo(double sueldoBase,int horas){
        sueldoTotal=sueldoBase*horas;
    }
}
