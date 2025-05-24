package techlab.practicas.c7;

public class Te extends Producto implements Descontable {
    private double precioBase;

    public Te(String nombre, double precioBase) {
        super(nombre);
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        // Por ejemplo, 5% de descuento por promoción de temporada
        return precioBase * 0.95;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase -= precioBase * (porcentaje / 100);
    }
}