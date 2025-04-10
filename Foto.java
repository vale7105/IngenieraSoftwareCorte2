class Foto {
    private final String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }
   
    public void print(){
        System.out.println("\u001B[34mImprimiendo foto: " + fichero + "\u001B[0m");
    }
}