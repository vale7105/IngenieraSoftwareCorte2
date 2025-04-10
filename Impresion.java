
import java.util.ArrayList;

class Impresion extends Producto{
   private final String color;
    private final ArrayList<Foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\u001B[35mImpresión #" + numero + " - Color: " + color + "\u001B[0m");
        for (Foto f : fotos) {
            f.print();
}

} 
}