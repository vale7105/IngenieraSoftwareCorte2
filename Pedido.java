import java.util.ArrayList;
import java.util.Date;

class Pedido{
    private final Cliente cliente;
    private final Date fecha;
    private final ArrayList<Producto> productos;
    private final int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarPedido() {
        System.out.println("\n\u001B[1;36m----- RESUMEN DEL PEDIDO -----\u001B[0m");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de Tarjeta de Crédito: " + getNumeroTarjetaCredito());
        System.out.println("\u001B[1;33mProductos adquiridos:\u001B[0m");
        for (Producto p : productos) {
            p.mostrarDetalles();
            
        }
        System.out.println("\u001B[1;36m-----------------------------\u001B[0m\n");

    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
}