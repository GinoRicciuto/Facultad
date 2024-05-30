package Ej1;

public class FichaEspecial extends Ficha{

    public FichaEspecial(String nombre, int fortaleza, int tamanio){
        super(nombre,fortaleza,tamanio,0);
    }
    public int getDestruccion(){
        return fortaleza/tamanio;
    }
}
