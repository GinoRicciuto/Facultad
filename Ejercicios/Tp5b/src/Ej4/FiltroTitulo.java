package Ej4;

public class FiltroTitulo extends Filtro<Pelicula>{
    private final String titulo;
    public FiltroTitulo(String titulo){
        this.titulo = titulo;
    }
    @Override
    public boolean cumple(Pelicula peli){
        return peli.getTitulo().contains(titulo);
    }
}
