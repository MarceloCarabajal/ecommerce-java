package techlab.practicas.c7;

public class Cafe extends Producto implements Descontable {
    private double precioBase;

    public Cafe(String nombre, double precioBase) {
        super(nombre); // uso de super
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        // Café tiene un recargo por packaging
        double recargo = 10;
        return precioBase + recargo;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento en " + super.getNombre());
        precioBase -= precioBase * (porcentaje / 100);
    }
}
