package techlab.practicas.c8.preentrega.excepciones;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String nombre) {
        super("Producto no encontrado: " + nombre);
    }

}
