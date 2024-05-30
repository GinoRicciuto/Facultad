package Ej1;

import java.util.ArrayList;

public class CentroComputo {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Tarea> cola_tareas;

    public CentroComputo(){
        computadoras = new ArrayList<Computadora>();
        cola_tareas = new ArrayList<Tarea>();
    }
    public void agregarComputadora(Computadora computadora){
        if(!computadoras.isEmpty()){
            int i = 0;
            while(i<computadoras.size()){
                if(computadoras.get(i).getVelocidad_procesamiento()<=computadora.getVelocidad_procesamiento()){
                    computadoras.add(i,computadora);
                } else if (i == computadoras.size()) {
                    computadoras.addLast(computadora);
                }
                i++;
            }
        }
        else{
            computadoras.addFirst(computadora);
        }
    }
    private Computadora getComputadoraLibre(){
        int i = 0;
        while (i<computadoras.size()){
            if(computadoras.get(i).estaDesoecupada()){
                return computadoras.get(i);
            }
            else i++;
        }
        System.err.println("No hay computadoras libres");
        return null;
    }
    public void agregarTarea(Tarea nuevaTarea){
        if (getComputadoraLibre() == null){
            //quiere decir que todas las computadoras de la lista estan ocupadas
            if(!cola_tareas.isEmpty()){
                int i=0;
                while (i<cola_tareas.size()){
                    if(cola_tareas.get(i).getRequisito_memoria()<=nuevaTarea.getRequisito_memoria()){
                        cola_tareas.add(i,nuevaTarea);
                    }
                    else if (i == cola_tareas.size()){
                        cola_tareas.addLast(nuevaTarea);
                    }
                    i++
                }
            }
            else {
                cola_tareas.addFirst(nuevaTarea);
            }
        }
        else {

        }
    }
}
