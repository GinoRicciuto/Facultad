package Ej1;

public class Tarea {
    private String nombre;
    private int requisito_memoria;

    public Tarea(String nombre,int requisito_memoria){
        this.nombre = nombre;
        this.requisito_memoria = requisito_memoria;
    }
    public int getRequisito_memoria(){
        return requisito_memoria;
    }
}
