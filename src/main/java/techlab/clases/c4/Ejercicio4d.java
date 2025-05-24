// Modularización:
//Tomá un código previo (como el de la clase anterior) y extraé partes en métodos.
//Comentá por qué ahora es más fácil de leer y mantener.

package techlab.clases.c4;

public class Ejercicio4d {
    public static void main(String[] args) {
        ejecutarCalculoPrecios();
        ejecutarGestionStock();
    }

    // Agrupamos toda la lógica de cálculo de precios
    public static void ejecutarCalculoPrecios() {
        System.out.println("=== Cálculo de Precio Final ===");
        calcularPrecioFinal(1000, 10, 30);  // Caso 1
        calcularPrecioFinal(500, 5, 60);    // Caso 2
    }

    // Agrupamos toda la lógica de gestión de stock
    public static void ejecutarGestionStock() {
        System.out.println("\n=== Gestión de Stock ===");
        int[] stock = inicializarStock();

        mostrarStock("antes de reponer", stock);
        reponerStock(stock, 1, 15);
        mostrarStock("después de reponer", stock);
    }

    public static void calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5;
            System.out.println("Cantidad mayor a 50, aumento de descuento a: " + descuento + "%");
        }
        double precioFinal = (precio - (precio * descuento / 100)) * cantidad;
        System.out.println("Precio final para " + cantidad + " unidades: $" + precioFinal);
    }

    public static int[] inicializarStock() {
        return new int[]{20, 35, 50}; // Stock de 3 productos
    }

    public static void reponerStock(int[] stock, int indice, int cantidad) {
        if (indice >= 0 && indice < stock.length && cantidad > 0) {
            stock[indice] += cantidad;
            System.out.println("Se repusieron " + cantidad + " unidades al producto " + (indice + 1));
        } else {
            System.out.println("Datos inválidos para reponer stock.");
        }
    }

    public static void mostrarStock(String momento, int[] stock) {
        System.out.println("Stock " + momento + ":");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("- Producto " + (i + 1) + ": " + stock[i] + " unidades");
        }
    }
}
