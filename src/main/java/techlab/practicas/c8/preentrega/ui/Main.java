package techlab.practicas.c8.preentrega.ui;

import techlab.practicas.c8.preentrega.excepciones.ProductoNoEncontradoException;
import techlab.practicas.c8.preentrega.excepciones.StockInsuficienteException;
import techlab.practicas.c8.preentrega.pedidos.Pedido;
import techlab.practicas.c8.preentrega.productos.Cafe;
import techlab.practicas.c8.preentrega.productos.Producto;
import techlab.practicas.c8.preentrega.productos.ProductoService;
import techlab.practicas.c8.preentrega.productos.Te;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== SISTEMA DE GESTIÓN - TECHLAB ===");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar y actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear un pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("7) Salir");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();


            switch (opcion) {
                case "1":
                    System.out.println("Tipo (Te/Cafe): ");
                    String tipo = scanner.nextLine().toLowerCase();
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Precio: ");
                    double precio = Double.parseDouble(scanner.nextLine());
                    System.out.println("Stock: ");
                    int stock = Integer.parseInt(scanner.nextLine());

                    if (tipo.equals("te")) {
                        productos.add(new Te(nombre, precio, stock));
                    } else if (tipo.equals("cafe")) {
                        productos.add(new Cafe(nombre, precio, stock));
                    } else {
                        System.out.println("Tipo de producto no válido");
                    }
                    break;

                case "2":
                    System.out.println("Productos:");
                    if( productos.isEmpty()) {
                        System.out.println("No hay productos");
                        break;
                    }
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println("[" + i + "] ");
                        productos.get(i).mostrarInformacion();
                    }
                    break;

                case "3":
                    System.out.println("Nombre del producto a buscar: ");
                    String buscar = scanner.nextLine();
                    try {
                        Producto producto = ProductoService.buscarProductoPorNombre(productos, buscar);
                        producto.mostrarInformacion();
                        System.out.println("Nuevo stock: ");
                        int nuevoStock = Integer.parseInt(scanner.nextLine());
                        producto.setStock(nuevoStock);
                        System.out.println("Producto actualizado");
                    } catch (ProductoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "4":
                    System.out.println("Índice del producto a eliminar: ");
                    int idx = Integer.parseInt(scanner.nextLine());
                    if (idx < productos.size()) {
                        productos.remove(idx);
                        System.out.println("Producto eliminado");
                    } else {
                        System.out.println("Índice no válido");
                    }
                    break;

                case "5":
                    Pedido pedido = new Pedido();
                    while (true) {
                        System.out.println("Nombre de producto a agregar al pedido o 'fin' para terminar: ");
                        String prodNomb = scanner.nextLine();
                        if (prodNomb.equalsIgnoreCase("fin")) break;
                        try {
                            Producto producto = ProductoService.buscarProductoPorNombre(productos, prodNomb);
                            System.out.println("Cantidad: ");
                            int cantidad = Integer.parseInt(scanner.nextLine());

                            if (producto.getStock() >= cantidad) {
                                for (int i = 0; i < cantidad; i++) {
                                    pedido.agregarProducto(producto);
                                }
                                producto.setStock(producto.getStock() - cantidad);
                                System.out.println("Producto agregado al pedido");
                            } else {
                                throw new StockInsuficienteException(producto.getNombre(), cantidad, producto.getStock());
                            }
                        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    pedidos.add(pedido);
                    pedido.mostrarPedido();
                    break;

                case "6":
                    System.out.println("Pedidos:");
                    if( pedidos.isEmpty()) {
                        System.out.println("No hay pedidos");
                    }
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("\n--- Pedido #" + (i+1) + " ---" );
                        pedidos.get(i).mostrarPedido();
                    }
                    break;

                case "7":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }

        System.out.println("Gracias por utilizar el sistema");
    }
}
