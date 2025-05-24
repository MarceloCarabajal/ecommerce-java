package techlab.practicas.c8.preentrega.productos;

public class Te extends Producto{
    public Te(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 0.95; //5% de descuento
    }
}
