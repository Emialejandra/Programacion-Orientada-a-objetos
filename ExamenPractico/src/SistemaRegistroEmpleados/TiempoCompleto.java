package SistemaRegistroEmpleados;

public class TiempoCompleto extends TechESFOT{
    // atributos extras
    protected int codigo;
    protected int horas;
    protected int aniosExperiencia;
    protected double bono;
    private double sueldoTotal;

    // objeto
//    TiempoCompleto tc = new TiempoCompleto();

    // constructor
    public TiempoCompleto(int codigo,String nombre, String apellido,String cargo, double sueldoBase, int horas, int aniosExperiencia, double bono) {
        super(nombre,apellido,cargo,sueldoBase);
        this.codigo=codigo;
        this.horas=horas;
        this.aniosExperiencia=aniosExperiencia;
        this.bono=bono;
    }

    // gets y sets
    public int getHoras(){
        return horas;
    }
    public int getAniosExperiencia(){
        return aniosExperiencia;
    }
    public void setHoras(int horas) throws DatosInvalidos{
        if(horas<8 || horas>12){
            throw new DatosInvalidos("Las horas ingresadas no son correctas.");
        }
        this.horas=horas;
    }
    public void setAniosExperiencia(int aniosExperiencia) throws DatosInvalidos{
        if(aniosExperiencia<2 ){
            throw new DatosInvalidos("Debe tener al menos 2 años de experiencia.");
        }
        this.aniosExperiencia=aniosExperiencia;
    }

    // sobreescribir metodo mostrar
    @Override
    public void Detalles(){
        System.out.println("Empleado de tiempo completo: ");
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Sueldo: "+ getSueldoBase());
        System.out.println("Horas: "+horas);
        System.out.println("Años de experiecia: "+aniosExperiencia +"\n");
    }

    // metodo calcular sueldo
    public void CalcularSueldo(double sueldoBase,double bono){
        sueldoTotal=sueldoBase+bono;
    }
}
