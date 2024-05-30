package Ej1;

public class Ficha {
    private String nombre;
    protected int fortaleza;
    protected int tamanio;
    private int destruccion;

    public Ficha(String nombre, int fortaleza, int tamanio, int destruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.tamanio = tamanio;
        this.destruccion = destruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacios() {
        return tamanio;
    }

    public int getDestruccion() {
        return destruccion;
    }
}
