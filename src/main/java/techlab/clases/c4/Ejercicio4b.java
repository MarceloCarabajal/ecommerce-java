// Parametros y argumentos:
//Creá un método calcularPrecioFinal que reciba el precio, el descuento y la cantidad. Si la cantidad es mayor a 50, aumentá el descuento. Imprimí el resultado.
//Definí un array con el stock de 3 productos.
//Escribí un método reponerStock que sume unidades a un índice específico del array.
//Mostrá el stock antes y después de la reposición.

package techlab.clases.c4;

public class Ejercicio4b {
    public static void main(String[] args) {

        // Ejercicio 1: calcular precio final
        System.out.println("=== Cálculo de Precio Final ===");
        double precio1 = calcularPrecioFinal(100, 30, 20);
        double precio2 = calcularPrecioFinal(100, 30, 52);
        double precio3 = calcularPrecioFinal(100, 40, 40);

        System.out.println("precio1 = " + precio1);
        System.out.println("precio2 = " + precio2);
        System.out.println("precio3 = " + precio3);

        // Ejercicio 2: gestión de stock
        System.out.println("\n=== Gestión de Stock ===");
        int[] stock = {10, 15, 20};

        System.out.println("Stock antes de reponer:");
        mostrarStock(stock);

        System.out.println("Stock luego de reponer:");
        reponerStock(stock, 5, 1);

    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if(cantidad > 50){
            descuento += 15;
        }
        double descuentoTotal = precio * (descuento/100);
        double precioTotal = precio - descuentoTotal;
        
        return precioTotal;
    }

    public static void reponerStock(int[] stock, int unidades, int indice) {
        stock[indice] += unidades;
        System.out.println("Se repusieron " + unidades + " al producto " + (indice + 1) );
        System.out.println("Valor del stock del producto " + (indice + 1) + " es = " + stock[indice]);
    }
    
    public static void mostrarStock(int[] stock) {
        for (int i = 0; i < stock.length ; i++) {
            System.out.println( (i+1) + " = " + stock[i]);
        }
    }
}
