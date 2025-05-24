//Creá un array de 5 productos.
//Imprimí sus elementos y luego intentá agregar un sexto producto (analizá el resultado).

package techlab.clases.c3;

public class Ejercicio3b {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Laptop";
        productos[1] = "Smartphone";
        productos[2] = "Auriculares";
        productos[3] = "Mouse";
        productos[4] = "Teclado";

        for (int i=0; i < productos.length; i++) {
            System.out.println("Producto " + (i+1) + ": " + productos[i]);
        }
        
        productos[6] = "Monitor";

        System.out.println("productos[6] = " + productos[6]);
    }
}
