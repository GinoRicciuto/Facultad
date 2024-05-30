package CienciasDeComputacion;

import java.util.ArrayList;

public class Congreso {
    private ArrayList<Evaluador> lista_evaluadores;
    private ArrayList<Trabajo> lista_trabajos;
    private ArrayList<String> temas_generales;
    private ArrayList<String> temas_especificos;
    private String nombre;

    public Congreso(String nombre){
        this.nombre= nombre;
        lista_evaluadores = new ArrayList<>();
        lista_trabajos = new ArrayList<>();
        temas_especificos = new ArrayList<>();
        temas_generales = new ArrayList<>();
    }
    public void agregarTrabajo(Trabajo nuevoTrabajo){
        lista_trabajos.add(nuevoTrabajo);
    }
    public void agregarTemaGeneral(String nuevoTema){
        temas_generales.add(nuevoTema);
    }
    public void agregarTemaEspecifico(String nuevoTema){
        temas_especificos.add(nuevoTema);
    }
    public void agregarEvaluador(Evaluador nuevoEvaluador){
        lista_evaluadores.add(nuevoEvaluador);
    }
    public void asignarEvaluador(Evaluador evaluador,Trabajo trabajo){
        if(trabajo.esEvaluadorApto(evaluador)){
            evaluador.agregarTrabajo(trabajo);
        }
    }
    public boolean esExperto(Evaluador evaluador){
        if(evaluador.getTemas().containsAll(temas_especificos)){
            return true;
        }
        else return false;
    }
    public ArrayList<Evaluador> evaluadoresAptos(Trabajo trabajo){
        ArrayList<Evaluador> res = new ArrayList<Evaluador>();
        for(Evaluador evaluador: lista_evaluadores){
            if(trabajo.esEvaluadorApto(evaluador)){
                res.add(evaluador);
            }
        }
        return res;
    }
    public ArrayList<Trabajo> trabajosAptos(Evaluador evaluador){
        ArrayList<Trabajo> res = new ArrayList<Trabajo>();
        for(Trabajo trabajo: lista_trabajos){
            if(trabajo.esEvaluadorApto(evaluador)){
                res.add(trabajo);
            }
        }
        return res;
    }
    public int cantTrabajosHechos(Evaluador evaluador){
        return evaluador.cantTrabajos();
    }
}
