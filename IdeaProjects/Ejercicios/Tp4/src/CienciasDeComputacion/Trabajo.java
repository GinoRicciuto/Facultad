package CienciasDeComputacion;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    protected ArrayList<String> palabrasClave;

    public Trabajo(String nombre){
        this.nombre = nombre;
        palabrasClave = new ArrayList<String>();

    }
    public String getNombre(){
        return nombre;
    }
    public void agregarPalabra(String nuevaPalabra){
        palabrasClave.add(nuevaPalabra);
    }
    public boolean esEvaluadorApto(Evaluador evaluador){
        if(evaluador.getTemas().containsAll(palabrasClave)){
            return true;
        }
        else{
            return false;
        }
    }
}
