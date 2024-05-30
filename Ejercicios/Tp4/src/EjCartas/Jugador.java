package EjCartas;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private List<Carta> mano;
    private List<Carta> ganadas;
    private String nombre_jugador;

    public Jugador(String nombre_jugador){
        this.nombre_jugador = nombre_jugador;
        mano = new ArrayList<Carta>();
        ganadas = new ArrayList<Carta>();
    }

    public int puntosMano(){
        int punt_total = 0;
        for (Carta cartita : mano){
            punt_total = punt_total + cartita.getPuntos();
        }
        return punt_total;
    }

    public void agregarCarta(Carta nuevaCarta){
        mano.addFirst(nuevaCarta);
    }
    public List<Carta> devolverCartas(){
        List<Carta> aux = new ArrayList<Carta>();
        for (Carta cartita : mano){
            aux.add(cartita);
            mano.remove(cartita);
        }
        return aux;
    }
    public void gano(List<Carta> cartasGanadas){
        ganadas.addAll(cartasGanadas);
        ganadas.addAll(mano);
        mano.clear();

    }

}
