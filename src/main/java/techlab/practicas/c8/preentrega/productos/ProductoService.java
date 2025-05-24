package techlab.practicas.c8.preentrega.productos;

import techlab.practicas.c8.preentrega.excepciones.ProductoNoEncontradoException;

import java.util.List;

public class ProductoService {
    public static Producto buscarProductoPorNombre(List<Producto> productos, String nombre) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException(nombre);
    }
}
