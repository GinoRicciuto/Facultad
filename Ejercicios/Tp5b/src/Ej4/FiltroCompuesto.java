package Ej4;

public class FiltroCompuesto extends Filtro<Pelicula> {
    private final Filtro<Pelicula> f1;
    private final Filtro<Pelicula> f2;

    public FiltroCompuesto(Filtro<Pelicula> f1, Filtro<Pelicula> f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean cumple(Pelicula peli){
        return f1.cumple(peli) && f2.cumple(peli);
    }
}
