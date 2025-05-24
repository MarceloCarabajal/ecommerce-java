package techlab.practicas.c8.preentrega.productos;

public abstract class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Variable estática para contar cuántos productos se crean
    private static int contador = 0;

    public Producto(String nombre, double precio, int stock) {
        this.id = ++contador;
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty() ) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("No se asigna un nombre vacío o nulo.");
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido para " + nombre + ". No se asigna el valor negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock inválido para " + nombre + ". No se asigna el valor negativo.");
        }
    }

    // Método para mostrar la info del producto
    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }

    public abstract double calcularPrecioFinal();

    // Getter de la variable estática
    public static int getContadorProductos() {
        return contador;
    }
}
