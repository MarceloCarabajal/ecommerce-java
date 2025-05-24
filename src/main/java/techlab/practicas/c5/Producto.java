package techlab.practicas.c5;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nStock: " + stock);
    }

    // Calcula y muestra el precio con 10% de descuento
    public void calcularDescuento() {
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;
        System.out.println("Precio con 10% de descuento: $" + precioFinal);
    }
}
