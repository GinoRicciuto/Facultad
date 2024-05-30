package Ej1;

public class Computadora {
    private final long velocidad_procesamiento;
    private Tarea tarea_actual;
    private final String marca;

    public Computadora(String nombre,int velocidad_procesamiento){
        this.marca = nombre;
        this.velocidad_procesamiento = velocidad_procesamiento;
    }
    public boolean estaDesoecupada(){
        return tarea_actual == null;
    }
    private void delay(){
        try{
            Thread.sleep(1000*velocidad_procesamiento);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void procesar(Tarea tarea){
        tarea_actual = tarea;
        delay();
        tarea_actual = null;
    }
    public long getVelocidad_procesamiento(){
        return velocidad_procesamiento;
    }
}
