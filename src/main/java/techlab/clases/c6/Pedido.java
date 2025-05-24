package techlab.clases.c6;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Producto> productos;

    public Pedido(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularCostoProducto() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
