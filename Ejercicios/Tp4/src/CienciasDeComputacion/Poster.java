package CienciasDeComputacion;

public class Poster extends Trabajo{
    public Poster(String nombre){
        super(nombre);
    }
    @Override
    public boolean esEvaluadorApto(Evaluador evaluador) {
        for (String tema: evaluador.getTemas()){
            if (palabrasClave.contains(tema)){
                return true;
            }
        }
        return false;
    }
}
