package techlab.clases.c5;

public class Main {
    public static void main(String[] args) {

        Producto teclado = new Producto("teclado", 20000);

        teclado.descontarStock();

        double precio = teclado.precioConDescuento();
        System.out.println("Precio final: " + precio);

        teclado.reporteProducto();

        Producto mouse = new Producto();

        mouse.reporteProducto();
    }
}
