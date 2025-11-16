public class ProductoNacional extends Producto{
    public ProductoNacional(String codigo, String nombre, double precioBase) {
        super(codigo,nombre,precioBase);
    }

    @Override
    public double getPrecioFinal(){
        return precioBase*1.12;
    }
}
