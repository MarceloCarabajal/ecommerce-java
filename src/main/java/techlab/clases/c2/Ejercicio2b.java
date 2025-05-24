//Pedile al usuario que ingrese un número, y luego usá un bucle for para imprimir desde 1 hasta ese número.
//Repetí lo mismo con un while y compará cuál te resulta más intuitivo.

package techlab.clases.c2;

import java.util.Scanner;

public class Ejercicio2b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(i+1);
        }

    }
}
