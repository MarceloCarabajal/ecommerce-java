package techlab.practicas.c5;

public class Main2 {
    public static void main(String[] args) {
        Producto product1 = new Producto();

        product1.nombre = "Memoria RAM";
        product1.precio = 300000;
        product1.stock = 5;

        product1.mostrarInformacion();

        product1.calcularDescuento();
    }
}
