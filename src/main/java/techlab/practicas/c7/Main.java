package techlab.practicas.c7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto teVerde = new Te("Té Verde", 1000);
        Producto cafeColombiano = new Cafe("Café Colombiano", 2000);

        // Polimorfismo
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(teVerde);
        productos.add(cafeColombiano);

        System.out.println("== Precios finales sin descuento ==");
        for (Producto p : productos) {
            System.out.println(p.getNombre() + ": $" + p.calcularPrecioFinal());
        }

        // Aplicar descuento si implementan Descontable
        System.out.println("\n== Aplicando 10% de descuento ==");
        for (Producto p : productos) {
            if (p instanceof Descontable) {
                ((Descontable) p).aplicarDescuento(10);
            }
        }

        System.out.println("\n== Precios finales con descuento ==");
        for (Producto p : productos) {
            System.out.println(p.getNombre() + ": $" + p.calcularPrecioFinal());
        }
    }
}
