package techlab.clases.c8.interfAbstr;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Descontable p1 = new ProductoPrecedero();
        Descontable p2 = new ProductoPromo();

        ArrayList<Descontable> productosEnPromocion = new ArrayList<>();

        productosEnPromocion.add(p2);

        // logica principal del proyecto
        for (Descontable descontable: productosEnPromocion){
            System.out.println(descontable.calcularDescuento());
        }

    }
}
