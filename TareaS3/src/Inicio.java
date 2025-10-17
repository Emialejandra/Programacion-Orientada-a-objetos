public class Inicio {
    public static void main() {
        Producto prod1=new Producto();
        prod1.setPrecio(500);
        prod1.setNombre("Salsa de tomate");
        prod1.Informacion();

        System.out.println("------------\n");
        Producto prod2=new Producto();
        prod2.setPrecio(-20);
        prod2.setNombre("Nachos");
        prod2.Informacion();

    }
}
