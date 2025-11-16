public abstract class Producto {
    protected String codigo;
    protected String nombre;
    protected double precioBase;

    public Producto(String codigo, String nombre, double precioBase) {
        if(codigo==null || codigo.isEmpty())
            throw new IllegalArgumentException("El codigo no puede estar vacio. ");
        if(nombre==null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio. ");
        if (precioBase<0)
            throw new IllegalArgumentException("La precio de base no puede ser menor a cero. ");
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double getPrecioFinal();

    public String toString() {
        return codigo + "-" + nombre + "-$" + getPrecioFinal();
    }

}
