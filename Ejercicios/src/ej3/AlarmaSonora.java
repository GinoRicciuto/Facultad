package ej3;

public class AlarmaSonora {
    protected boolean vidrio;
    protected boolean puerta_ventana;
    protected boolean movimiento;

    public AlarmaSonora(){
        vidrio = false;
        puerta_ventana = false;
        movimiento = false;
    }
    public void comprobar(){
        if (vidrio || puerta_ventana || movimiento){
            hacerSonar();
        }
    }
    protected void hacerSonar(){
        System.out.println("Alarma Sonando...");
    }
}
