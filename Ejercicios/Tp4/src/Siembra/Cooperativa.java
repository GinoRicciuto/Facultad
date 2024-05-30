package Siembra;

import java.util.List;

public class Cooperativa {
    private String nombre_cooperativa;
    private List<Lote> lista_lotes;
    private List<Cereal> lista_cereales;
    private List<String> minerales_especiales;

    public Cooperativa(String nombre_cooperativa) {
        this.nombre_cooperativa = nombre_cooperativa;
    }
    public boolean esLoteEspecial(Lote lote){
        if(lote.tieneMinerales(minerales_especiales)){
            return true;
        }
        else return false;
    }

}
