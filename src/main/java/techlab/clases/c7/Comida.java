package techlab.clases.c7;

public class Comida extends Producto{
    private int pesoGramos;

    public Comida(){}

    public Comida(String nombre, double precio, int pesoGramos){
        super(nombre, precio);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso en g: " + pesoGramos);
    }

/*    @Override
    public double calcularTotal() {
        return 0;
    }*/


}
