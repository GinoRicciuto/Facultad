package Ej4;

public class FiltroDirector extends Filtro<Pelicula>{
    private final String director;
    public FiltroDirector(String director){
        this.director = director;
    }
    @Override
    public boolean cumple(Pelicula peli){
        return peli.getDirector().contains(director);
    }
}
