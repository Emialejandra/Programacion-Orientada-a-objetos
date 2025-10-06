import java.util.Scanner;
public class Persona {
    int cedula;
    String nombre;
    int edad;
    String correo;
//es obligatorio poner un  metodo constructor

    public Persona(int cedula, String nombre, int edad, String correo) {  //metodo constructor

        //los parametros dentro dentro del parentesis ve en el mismo orden que los atributos
        //y es recomendable no poner el mismo nombre de parametro con el de atributos

        this.cedula = cedula;    //es la inicializacion del atributo
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    void Imprimir(){ //
        System.out.println("Bienvenido "+nombre+" "+cedula+" "+edad+" "+correo);
    }


    public static void main(String[] args) { //en el main se da los valores a los atributos
        Persona objeto1=new Persona(1204693806,"Fernando", 25,"ff@gail.com");
        objeto1.Imprimir();

        Persona objeto2=new Persona(1725930570, "Emilia", 20, "emilia@gmail.com");
        objeto2.Imprimir();
    }
}
