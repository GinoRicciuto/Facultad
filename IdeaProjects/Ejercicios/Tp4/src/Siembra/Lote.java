package Siembra;

import java.util.List;

public class Lote {
    private List<Cereal> cultivo_sembrado;
    private List<String> minerales;
    private int hectareas;

    public Lote(int hectareas){
        this.hectareas = hectareas;
    }
    public void agregarMineral(String nuevoMineral){
        minerales.add(nuevoMineral);
    }
    public void sembrar(Cereal nuevoCereal){
        cultivo_sembrado.add(nuevoCereal);
    }
    public boolean tieneMinerales(List<String> lista_minerales){
        return lista_minerales.containsAll(minerales);
    }
    public int getHectareas(){
        return hectareas;
    }
}
