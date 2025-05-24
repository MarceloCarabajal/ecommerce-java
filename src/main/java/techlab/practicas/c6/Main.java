package techlab.practicas.c6;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 5000, 10);
        Producto p2 = new Producto("Mouse", 3000, 5);
        Producto p3 = new Producto("Monitor", 20000, 2);

        // Probar setter con valor negativo
        p1.setCantidadEnStock(-10); // no debe cambiar el stock
        System.out.println("Stock actual de Teclado: " + p1.getCantidadEnStock());

        // Carrito
        Carrito miCarrito = new Carrito();
        miCarrito.agregarProducto(p1);
        miCarrito.agregarProducto(p2);
        miCarrito.agregarProducto(p3);

        // Mostrar productos y total
        System.out.println("\nProductos en el carrito:");
        miCarrito.mostrarProductos();

        System.out.println("\nTotal del carrito: $" + miCarrito.calcularTotal());

        // Mostrar cuántos productos se crearon
        System.out.println("\nCantidad total de productos creados: " + Producto.getContadorProductos());
    }
}
