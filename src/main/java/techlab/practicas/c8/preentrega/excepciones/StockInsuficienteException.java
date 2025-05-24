package techlab.practicas.c8.preentrega.excepciones;

public class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String producto, int solicitado, int disponible) {
      super("Stock insuficiente para el producto " + producto + ". Solicitado: " + solicitado + ", Disponible: " + disponible);
    }
}
