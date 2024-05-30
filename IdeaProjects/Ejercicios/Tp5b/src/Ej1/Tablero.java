package Ej1;

import java.util.ArrayList;

public class Tablero {
    private int puntaje_minimo;
    private ArrayList<Ficha> lista_fichas;

    public Tablero(int puntaje_minimo){
        lista_fichas = new ArrayList<>();
        this.puntaje_minimo = puntaje_minimo;
    }
    public void agregarFicha(Ficha nuevaFicha){
        lista_fichas.add(nuevaFicha);
    }
    public double getDificultad(){
        double fortalezaTotal = 0;
        double destruccionTotal = 0;
        for(Ficha ficha : lista_fichas){
            fortalezaTotal = ficha.getFortaleza() + fortalezaTotal;
            destruccionTotal = ficha.getDestruccion() + destruccionTotal;
        }
        return fortalezaTotal / destruccionTotal;
    }
}
