package ej1;

public class Coleccion {
    private Object objeto_guardado;

    public Coleccion (){}
    public void setObjeto(Object nuevoObjeto){
        objeto_guardado = nuevoObjeto;
    }
    public Object getObjeto(){
        return objeto_guardado;
    }
}
