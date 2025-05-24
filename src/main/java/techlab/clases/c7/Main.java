package techlab.clases.c7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Super Clase
        Producto producto1 = new Producto("Laptop", 100000);
        producto1.mostrarInfo();

        //Sub Clase
        Bebida bebida1 = new Bebida("Coca Cola", 1000, 300);
        bebida1.mostrarInfo();

        //Sub Clase
        Comida comida1 = new Comida("Pizza", 1000, 100);
        comida1.mostrarInfo();

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(bebida1);
        productos.add(comida1);

        for (Producto producto : productos) {
            producto.mostrarInfo();
            if (producto instanceof Bebida) {
                Bebida bebida = (Bebida) producto;
                bebida.nuevoMetodo();
            }
        }

    }
}
