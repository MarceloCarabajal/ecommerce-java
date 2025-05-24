// Sobrecarga de métodos:
//Creá dos métodos mostrarMensaje: uno recibe una String, otro recibe una String y un int.
//Usá ambos para imprimir mensajes en función de si el cliente es nuevo o recurrente.

package techlab.clases.c4;

public class Ejercicio4c {
    public static void main(String[] args) {
        mostrarMensaje("Hello World", 10);
        mostrarMensaje("Welcome");
    }

    public static void mostrarMensaje(String mensaje, int numero) {
        System.out.println(mensaje + ", " + numero);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }



}
