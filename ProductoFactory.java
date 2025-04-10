public class ProductoFactory {
    public static Producto crearProducto(String tipo, int numero, String... args) {
        switch (tipo.toLowerCase()) {
            case "impresion":
                return new Impresion(numero, args[0]);
            case "camara":
                return new Camara(numero, args[0], args[1]);
            default:
                throw new IllegalArgumentException("Tipo de producto desconocido");

            }
        }
}
