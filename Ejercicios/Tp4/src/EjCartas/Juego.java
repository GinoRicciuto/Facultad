package EjCartas;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private Mazo mazo;
    private final int cant_rondas;
    private final int cant_cartas_mano;
    private final int max_jugadores;
    private final int min_jugadores;
    private final int min_cartas;                 //minimo de cartas para poder jugar
    private int ronda_actual;

    public Juego(int cant_rondas,int cant_cartas_mano, int max_jugadores, int min_cartas, int min_jugadores){
        jugadores = new ArrayList<Jugador>();
        mazo = new Mazo();
        this.cant_rondas = cant_rondas;
        this.cant_cartas_mano = cant_cartas_mano;
        this.max_jugadores = max_jugadores;
        this.min_cartas = min_cartas;
        this.min_jugadores = min_jugadores;
        ronda_actual = 0;
    }
    public void agregarCarta(Carta nuevaCarta){
        mazo.agregarCarta(nuevaCarta);
    }
    public void agregarCarta(String palo,int numero, int puntaje){
        Carta nueva = new Carta(numero,puntaje,palo);
        mazo.agregarCarta(nueva);
    }
    public void agregarJugador(String nombre){
        if (jugadores.size()<= max_jugadores) {
            Jugador nuevo = new Jugador(nombre);
            jugadores.add(nuevo);
        }
        else{
            System.err.println("Ya se alcanzo el maximo de jugadores permitidos");
        }
    }
    public void agregarJugador(Jugador nuevoJugador){
        if(jugadores.size()<= max_jugadores)
            jugadores.add(nuevoJugador);
        else{
            System.err.println("Ya se alcanzo el maximo de jugadores permitidos");
        }
    }
    private void repartirCartas(){
        for (Jugador actual : jugadores) {
            for (int i = 0; i < cant_cartas_mano; i++) {
                mazo.repartir(actual);
            }
        }
    }
    private Jugador buscarGanador(){
        Jugador actualMayorPuntaje = null;
        int totalPuntos = 0;

        for(Jugador actual : jugadores){
            if (actual.puntosMano()>totalPuntos){

                actualMayorPuntaje = actual;

            }
            if (actual.puntosMano() == totalPuntos){
                actualMayorPuntaje = null;
            }
        }
        return actualMayorPuntaje;
    }
    private List<Carta> juntarCartasDeGanador(Jugador ganador){
        List<Carta> aux = new ArrayList<Carta>();
        for (Jugador actual : jugadores){
            if (!actual.equals(ganador)){
                aux.addAll(actual.devolverCartas());
            }
        }
        return aux;
    }
    public void comenzar(){
        if (mazo.cantidadCartas() >= min_cartas && jugadores.size()>= min_jugadores){
            while(ronda_actual<=cant_rondas){
                mazo.mezclarMazo();
                repartirCartas();
                Jugador ganador = buscarGanador();
                List<Carta> cartasGanador = juntarCartasDeGanador(ganador);
                ganador.gano(cartasGanador);
                ronda_actual++;
            }
        }
        else{
            if(mazo.cantidadCartas() <= min_cartas){
                System.err.println("No hay suficientes cartas para empezar el juego");
            }
            else{
                System.err.println("No hay suficientes jugadores para empezar el juego");
            }
        }
    }
}
