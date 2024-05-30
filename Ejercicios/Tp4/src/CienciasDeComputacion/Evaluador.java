package CienciasDeComputacion;

import java.util.ArrayList;


//la idea es, hay evaluadores normales y expertos, todos son evaluadores entonces van en la clase evaluador, luego, la clase que lo invoca decide si es experto o no, no es una clase aparte
public class Evaluador {
    private String nombre;
    private ArrayList<String> temasConocidos;
    private ArrayList<Trabajo> trabajosEvaluados;

    public Evaluador(String nombre){
        this.nombre = nombre;
        temasConocidos = new ArrayList<String>();
        trabajosEvaluados = new ArrayList<Trabajo>();
    }

    public String getNombre(){
        return nombre;
    }
    public void agregarTema(String tema){
        temasConocidos.add(tema);
    }
    public void agregarTrabajo(Trabajo nuevoTrabajo){
        if (nuevoTrabajo.esEvaluadorApto(this)) {

            trabajosEvaluados.add(nuevoTrabajo);
        }
    }
    public ArrayList<String> getTemas(){
        ArrayList<String> res = new ArrayList<String>();
        res.addAll(temasConocidos);
        return res;
    }
    public int cantTrabajos(){
        return trabajosEvaluados.size();
    }
}
