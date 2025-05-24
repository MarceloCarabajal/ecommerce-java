package techlab.practicas.c7;

public abstract class Producto {
    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPrecioFinal();
}