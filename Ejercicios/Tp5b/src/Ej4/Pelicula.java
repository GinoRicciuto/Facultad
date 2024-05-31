package Ej4;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anio_estreno;
    private int duracion;
    private int edad_minima;

    public Pelicula(String titulo, String sinopsis, String director, int anio_estreno, int duracion, int edad_minima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anio_estreno = anio_estreno;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        actores = new ArrayList<>();
        generos = new ArrayList<>();
    }
    public void agregarActor(String actor){
        actores.add(actor);
    }
    public void agregarGenero(String genero){
        generos.add(genero);
    }
    public boolean tieneGenero(String genero){
        return generos.contains(genero);
    }
    public boolean tieneActor(String actor){
        return actores.contains(actor);
    }
    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getAnio_estreno() {
        return anio_estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public String getDirector() {
        return director;
    }

}

