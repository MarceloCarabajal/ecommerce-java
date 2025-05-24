package techlab.clases.c6;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(){}

    public  Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

}
