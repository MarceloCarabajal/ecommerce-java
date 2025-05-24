package techlab.clases.c7;

public class Bebida extends Producto {
    private int volumenML;

    public Bebida(){}

    public Bebida(String nombre, double precio, int volumenML){
        super(nombre, precio);
        this.volumenML = volumenML;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        this.nuevoMetodo();
        System.out.println("Volumen en ml: " + volumenML);
    }

    public void nuevoMetodo() {
        System.out.println("Nuevo metodo");
    }

/*    @Override
    public double calcularTotal() {
        return 0;
    }*/

}
