class Camara extends Producto{
    private final String marca;
    private final String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\u001B[32mCámara #" + numero + " - Marca: " + marca + ", Modelo: " + modelo + "\u001B[0m");
    }
}