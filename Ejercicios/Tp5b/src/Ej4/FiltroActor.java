package Ej4;

public class FiltroActor extends Filtro<Pelicula>{
    private final String actor;
    public FiltroActor(String actor){
        this.actor = actor;
    }
    @Override
    public boolean cumple(Pelicula peli){
        return peli.tieneActor(actor);
    }
}
