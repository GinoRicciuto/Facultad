package Ej4;

public class FiltroGenero extends Filtro<Pelicula>{
    private final String genero;
    public FiltroGenero(String genero){
        this.genero = genero;
    }
    @Override
    public boolean cumple(Pelicula peli){
        return peli.tieneGenero(genero);
    }
}