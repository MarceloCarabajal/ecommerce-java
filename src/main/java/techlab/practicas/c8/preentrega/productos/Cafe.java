package techlab.practicas.c8.preentrega.productos;

public class Cafe extends Producto{
    public Cafe(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + 10; //recargo fijo
    }
}
