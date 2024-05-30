package ej4;

import java.util.ArrayList;
import java.util.List;

public class AlarmaSonora {
    private List<Sensor> sensores;

    public AlarmaSonora(){
        sensores = new ArrayList<>();
    }
    public void agregarSensor(Sensor nuevoSensor){
        sensores.add(nuevoSensor);
    }
    public void comprobar(){
        for(Sensor s:sensores){
            if (s.esActivo()){
                hacerSonar(s.getZona());
            }
        }
    }
    protected void hacerSonar(String zona){
        System.out.println("Alarma Sonando en "+ zona);
    }
}
