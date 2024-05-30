package EjCartas;

public class Carta {
    private int numero;
    private int puntos;
    private String palo;

    public Carta(int numero, int puntos, String palo) {
        this.numero = numero;
        this.puntos = puntos;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getPalo() {
        return palo;
    }
}
