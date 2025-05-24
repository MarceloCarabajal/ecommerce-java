package techlab.practicas.c6;

public class Cliente {
    private String nombre;
    private String email;

    public Cliente(){}

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        setEmail(email);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        if((email != null) && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("El email no es valido");
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
    }
}
