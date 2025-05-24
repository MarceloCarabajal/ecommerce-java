package techlab.clases.c7;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(){}

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio);
    };
    //public abstract double calcularTotal();
}
