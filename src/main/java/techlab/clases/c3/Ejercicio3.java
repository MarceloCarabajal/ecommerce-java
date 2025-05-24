//Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
//Mostrá su longitud, su primera letra y verificá si contiene la palabra "Chai".

package techlab.clases.c3;

public class Ejercicio3 {
    public static void main(String[] args) {

        String producto = " té CHAi ";
        
        producto = producto.trim().toLowerCase();

        String[] palabra = producto.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palabra.length; i++) {
            if(!palabra[i].isEmpty()){
                String primeraLetra = palabra[i].substring(0,1).toUpperCase();
                String resto = palabra[i].substring(1);
                sb.append(primeraLetra).append(resto);
                if (i < palabra.length -1) {
                    sb.append(" ");
                }
            }
        }

        System.out.println("sb = " + sb.toString());
        System.out.println("longitud de sb: " + sb.length());

        String primeraLetra = sb.substring(0,1);
        System.out.println("primera letra: " + primeraLetra);

        Boolean contiene = sb.toString().contains("Chai");
        System.out.println("contiene = " + contiene);
    }
}
