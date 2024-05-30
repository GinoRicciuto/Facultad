package EjCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
    }
    public void repartir(Jugador destino) {
        destino.agregarCarta(cartas.getFirst());
        cartas.removeFirst();
    }
    public void mezclarMazo(){
        Collections.shuffle(cartas);
    }
    public void agregarCarta(Carta nuevaCarta){
        cartas.addLast(nuevaCarta);
    }
    public int cantidadCartas(){
        return cartas.size();
    }
}
