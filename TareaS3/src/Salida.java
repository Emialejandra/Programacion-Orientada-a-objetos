public class Salida {
    public static void main() {
        //crear el objeto
        Vehiculo vh=new Vehiculo("Toyota", "Corolla", 180,1250,"rojo");

        //mostrar atributos que se muestran directamente
        System.out.println("Marca: "+vh.marca);

        //lectura del codigo de seguridad
        //System.out.println(vh.setCodigoSeguridad());

        //Intentar ingresar un color no permitido
        //vh.setColor("amarillo");

        //Imprimir datos validos del vehiculo
        System.out.println("Modelo: "+vh.getModelo());
        System.out.println("velocidad Maxima: "+vh.getVelocidadMax());
        System.out.println("Colo: "+vh.getColor());

        //vehiculo 2
        System.out.println("\n----------------------");
        Vehiculo vh2=new Vehiculo("Ford", "Raptor",190, 2222, "azul");
        System.out.println("Marca: "+vh2.marca);
        System.out.println("Modelo: "+vh2.getModelo());
        System.out.println("velocidad Maxima: "+vh2.getVelocidadMax());
        System.out.println("Colo: "+vh2.getColor());
    }
}
