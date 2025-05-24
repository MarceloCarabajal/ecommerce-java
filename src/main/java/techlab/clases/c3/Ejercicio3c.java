//Creá un ArrayList<String> para productos.
//Agregá varios productos, eliminá uno, verificá si otro existe y luego imprimí la lista final.

package techlab.clases.c3;

import java.util.ArrayList;

public class Ejercicio3c {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        
        productos.add("Monitor");
        productos.add("Mouse");

        System.out.println("productos = " + productos);
        
        productos.remove(1);

        System.out.println("productos = " + productos);
        
        String contiene = String.valueOf(productos.contains("Monitor"));
        System.out.println("contiene = " + contiene);
    }
}
