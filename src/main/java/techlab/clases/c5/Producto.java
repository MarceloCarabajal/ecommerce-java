package techlab.clases.c5;

public class Producto {
    // descripcion (atributos/propiedades)
    String nombre;
    double precio;
    int stock;

    // constructores
    public Producto(){}

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 20;
    }


    // funcionamiento (metodos)
    void descontarStock(){
        // comportamiento para descontar stock
        System.out.println("Descontando stock ...");

    }

    void reporteProducto(){
        System.out.println("El producto " + nombre + " vale $" + precio + " cada unidad");
    }

    double precioConDescuento() {
        return precio - precio * 0.2;
    }

/*    String nameCapitalize() {

    }*/
}
