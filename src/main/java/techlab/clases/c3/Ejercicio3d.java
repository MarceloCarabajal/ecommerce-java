package techlab.clases.c3;

import java.util.ArrayList;

public class Ejercicio3d {
    public static void main(String[] args) {

        // Lista de productos desprolijos
        ArrayList<String> productos = new ArrayList<>();

        productos.add("  laptop ");
        productos.add("SMARTphone");
        productos.add("  aURIculares");
        productos.add("mouse  ");
        productos.add("  teclado");

        System.out.println("Productos originales:");
        for (String producto : productos) {
            System.out.println("- '" + producto + "'");
        }

        // Aplicar el formateo
        formatearProductos(productos);

        System.out.println("\nProductos formateados:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }

    // Método para formatear cada nombre
    public static void formatearProductos(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i).trim().toLowerCase(); // saco espacios y pongo en minúscula
            if (!nombre.isEmpty()) {
                nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1); // primera letra en mayúscula
            }
            lista.set(i, nombre); // Actualizar el nombre en la lista
        }
    }
}
