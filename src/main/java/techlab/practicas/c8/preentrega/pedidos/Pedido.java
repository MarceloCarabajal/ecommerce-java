package techlab.practicas.c8.preentrega.pedidos;


import techlab.practicas.c8.preentrega.excepciones.StockInsuficienteException;
import techlab.practicas.c8.preentrega.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<LineaPedido> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) throws StockInsuficienteException {
        if (producto.getStock() < cantidad) {
            throw new StockInsuficienteException(producto.getNombre(), cantidad, producto.getStock());
        }

        items.add(new LineaPedido(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaPedido item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("==== Resumen del Pedido ====");
        for (LineaPedido item: items) {
            System.out.println(item.getProducto().getNombre() +
                    " x " + item.getCantidad() +
                    " = $" + item.calcularSubtotal());
        }
        System.out.println("Total del pedido: $" + calcularTotal());
    }
}
