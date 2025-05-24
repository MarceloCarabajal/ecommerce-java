package techlab.practicas.c8.practica8.excepciones;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String nombre) {
        super("Producto no encontrado: " + nombre);
    }

}
