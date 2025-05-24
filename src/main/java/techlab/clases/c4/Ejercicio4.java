// Creación de Funciones
//Escribí un método calcularImpuesto que reciba un precio y un porcentaje de impuesto, y devuelva el precio final.
//Llamá al método desde main con distintos valores.

package techlab.clases.c4;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        double precioTotal1 = calcularImpuesto(1000, 30);
        double precioTotal2 = calcularImpuesto(100, 20);

        System.out.println("precioTotal1 = " + precioTotal1);
        System.out.println("precioTotal2 = " + precioTotal2);
    }

    public static double calcularImpuesto(double precio, double porcentaje){
        double impuesto = precio * (porcentaje/100);
        return precio + impuesto;
    }
}
