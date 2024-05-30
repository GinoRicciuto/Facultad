package Siembra;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    protected List<String> minerales_requeridos;
    protected String nombre_cereal;
    protected String tipo;

    public Cereal(String nombre_cereal,String tipo){
        this.nombre_cereal = nombre_cereal;
        this.tipo = tipo;
        minerales_requeridos = new ArrayList<String>();
    }
    public void agregarMineralRequerido(String mineral){
        minerales_requeridos.add(mineral);
    }
    public void sembrar(Lote terreno){
        List<String> mineralesAux = minerales_requeridos;
        if (terreno.tieneMinerales(mineralesAux)){
            terreno.sembrar(this);
        }
    }
}
