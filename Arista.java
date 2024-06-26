package models;

public class Arista {
    private Vertice origen;
    private Vertice destino;
    private double peso;

    /**
     *
     * @param origen
     * @param destino
     */
    public Arista(Vertice origen, Vertice destino) {
        this(origen, destino, 1.0);
    }

    /**
     *
     * @param origen
     * @param destino
     * @param peso
     */
    public Arista(Vertice origen, Vertice destino, double peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Arista{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", peso=" + peso +
                '}';
    }

    public Vertice getOrigen() {
        return origen;
    }

    public void setOrigen(Vertice origen) {
        this.origen = origen;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
