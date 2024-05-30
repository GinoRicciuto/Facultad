package ej4;

public class Sensor {
    private String zona;
    private boolean activo;

    public Sensor(String zona){
        this.zona = zona;
        activo = false;
    }
    public String getZona(){
        return zona;
    }
    public void detecto() {
        activo = true;
    }
    public boolean esActivo(){
        return activo;
    }
}
