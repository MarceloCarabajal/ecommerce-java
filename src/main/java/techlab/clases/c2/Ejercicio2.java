package techlab.clases.c2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stock = 150;
        double precioUnitario = 5000;

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese cantidad a comprar: ");
        int cantidad = sc.nextInt();
        if (cantidad < stock) {
            if (cantidad > 100) {
                System.out.println("Tiene un descuento especial para su proxima compra");
                System.out.println("Precio en del producto: $" + precioUnitario);
                double total = precioUnitario * cantidad;
                System.out.println(nombre + ", El precio total es: " + total);
            } else {
                System.out.println("Precio en del producto: $" + precioUnitario);
                double total = precioUnitario * cantidad;
                System.out.println(nombre + ", El precio total es: " + total);
            }
        } else {
            System.out.println("No hay stock");
        }
    }
}
