package EjCartas;

public class Main {
    private static Juego nuevoJuego;
    public static void main(String[] args) {
        nuevoJuego = new Juego(3,2,3,10,3);
        Jugador j1 = new Jugador("Gino");
        Jugador j2 = new Jugador("Esbetan");
        Jugador j3 = new Jugador("Juan");
        nuevoJuego.agregarCarta("Basto",8,8);
        nuevoJuego.agregarCarta("Basto",1,1);
        nuevoJuego.agregarCarta("Basto",2,2);
        nuevoJuego.agregarCarta("Basto",3,3);
        nuevoJuego.agregarCarta("Espada",1,10);
        nuevoJuego.agregarCarta("Espada",2,11);
        nuevoJuego.agregarCarta("Espada",3,12);
        nuevoJuego.agregarCarta("Espada",8,18);
        nuevoJuego.agregarCarta("Copa",1,30);
        nuevoJuego.agregarCarta("Copa",2,15);
        nuevoJuego.comenzar();

    }
}