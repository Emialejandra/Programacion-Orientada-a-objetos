public class Producto {
    private  double precio;
    private String nombre;

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) {
        if(precio< 0.0){
            System.out.println("El precio debe ser mayor a cero.");
        }else {
            this.precio = precio;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo de mostrar la informacion
    void Informacion(){
        System.out.println("Informacion del producto");
        System.out.println("Precio: "+getPrecio());
        System.out.println("Nombre: "+getNombre());
    }
}
