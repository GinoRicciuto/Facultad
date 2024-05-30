package Siembra;

import java.util.List;

public class Pastura extends Cereal{
    private int hecRequeridas;

    public Pastura(String nombre,int hecRequeridas){
        super(nombre,"Pastura");
        this.hecRequeridas = hecRequeridas;
    }
    @Override
    public void sembrar(Lote terreno){
        List<String> mineralesAux = minerales_requeridos;
        if (terreno.tieneMinerales(mineralesAux)){
            if(terreno.getHectareas()>=hecRequeridas) {
                terreno.sembrar(this);
            }
            else {
                System.err.println("El terreno no tiene las hectareas requeridas");
            }
        }
        else{
            System.err.println("El terreno no tiene los minerales requeridos");
        }
    }
}
