package SistemaRegistroEmpleados;

import java.security.PrivateKey;

public abstract class TechESFOT {
    // atributos
    private String nombre;
    private String apellido;
    private String cargo;
    private double sueldoBase;

    // constructor
    public TechESFOT(String nombre, String apellido, String cargo, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.sueldoBase=sueldoBase;
    }

    // validaciones get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws DatosInvalidos{
        if(nombre==null || nombre.trim().isEmpty()){
            throw new DatosInvalidos("Debe ingresar un nombre");
        }
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) throws DatosInvalidos{
        if(apellido==null || apellido.trim().isEmpty()){
            throw new DatosInvalidos("Debe ingresar un apellido");
        }
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) throws DatosInvalidos{
        if(cargo==null || cargo.trim().isEmpty()){
            throw new DatosInvalidos("El cargo debe ingresarlo");
        }
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) throws DatosInvalidos{
        if(sueldoBase<0){
            throw new DatosInvalidos("El sueldo no puede ser negativo.");
        }
    }

    // metodo mostrar
    public abstract void Detalles();

    // metodo calcular sueldo
    public void CalcularSueldo(double sueldoBase){
        this.sueldoBase=sueldoBase;
    };

}
