package techlab.practicas.c8.practica8.productos;

import techlab.practicas.c8.practica8.excepciones.ProductoNoEncontradoException;

import java.util.List;

public class ProductoService {
    public static Producto buscarProducto(List<Producto> productos, String nombre) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException(nombre);
    }
}
