package techlab.practicas.c5;

public class Cliente {
    String nombre;
    String email;

    public Cliente(){}

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
