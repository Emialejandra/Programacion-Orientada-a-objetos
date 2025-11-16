public class ProductoImportado extends Producto{

    public ProductoImportado(String codigo, String nombre, double precioBase) {
        super(codigo,nombre,precioBase);
    }

    @Override
    public double getPrecioFinal(){
        return precioBase*1.05;
    }
}
