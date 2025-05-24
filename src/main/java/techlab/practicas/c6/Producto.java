package techlab.practicas.c6;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Variable estática para contar cuántos productos se crean
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        setCantidadEnStock(cantidadEnStock);
        contadorProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("Stock inválido para " + nombre + ". No se asigna el valor negativo.");
        }
    }

    // Método para mostrar la info del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + cantidadEnStock);
    }

    // Getter de la variable estática
    public static int getContadorProductos() {
        return contadorProductos;
    }
}
