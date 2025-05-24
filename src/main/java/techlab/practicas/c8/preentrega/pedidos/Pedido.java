package techlab.practicas.c8.preentrega.pedidos;

import techlab.practicas.c8.preentrega.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Pedido:");
        for (Producto p: productos) {
            p.mostrarInformacion();
            System.out.println(" -> Precio final: $" + p.calcularPrecioFinal());
        }
        System.out.println("Total del pedido: $" + calcularTotal());
    }
}
