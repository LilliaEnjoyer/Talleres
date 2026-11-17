public class AccesoDirecto implements Elemento{
    private String nombre;
    private Elemento destino;

    public AccesoDirecto(String nombre, Elemento destino) {
        this.nombre = nombre;
        this.destino = destino;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamanoKB() {
        return 1; // Peso fijo de 1 KB segun el requisito
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + nombre + " -> " + destino.getNombre() + " " + getTamanoKB() + " KB");
    }
}
