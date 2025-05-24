// Creación de clases y objetos
//Crea una clase Cliente con atributos nombre y email.
//Instanciá un objeto Cliente y asignale valores a sus atributos.
package techlab.practicas.c5;

public class Main1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Marcelo";
        cliente1.email = "marce@marce.com";

        System.out.println("Nombre = " + cliente1.nombre);
        System.out.println("Email = " + cliente1.email);

        Cliente cliente2 = new Cliente("Martin", "martin@martin.com");
        Cliente cliente3 = new Cliente("Jorge", "jorge@jorge.com");
        Cliente cliente4 = new Cliente("Mercedes", "merce@mercedes.com");

        System.out.println("cliente2 con constructor = " + cliente2);
        System.out.println("cliente3 con constructor = " + cliente3);
        System.out.println("cliente4 con constructor= " + cliente4);
    }
}
