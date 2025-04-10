public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("12345", "Valeria Quitiaquez");

        
        Impresion impresion = (Impresion) ProductoFactory.crearProducto("impresion", 1, "Color");
        impresion.agregarFoto(new Foto("foto1.jpg"));
        impresion.agregarFoto(new Foto("foto2.jpg"));

        Camara camara = (Camara) ProductoFactory.crearProducto("camara", 2, "Canon", "EOS R50");

        
        Pedido pedido = new Pedido(cliente, 123456789);
        pedido.agregarProducto(impresion);
        pedido.agregarProducto(camara);

        
        pedido.mostrarPedido();

    }
}
