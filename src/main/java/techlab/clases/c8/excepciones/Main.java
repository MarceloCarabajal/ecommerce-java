package techlab.clases.c8.excepciones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            funcionPrincipal();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }

    public static  void funcionPrincipal() {
        ArrayList<String> lista = new ArrayList<>();

        System.out.println(lista.get(5));
    }
}
