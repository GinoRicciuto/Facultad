package ej3;

public class AlarmaLuminosa extends AlarmaSonora{
    public AlarmaLuminosa(){
        vidrio = false;
        puerta_ventana = false;
        movimiento = false;
    }

    @Override
    public void comprobar() {
        super.comprobar();
        encenderLuces();
    }
    private void encenderLuces(){
        System.out.println("Luces encendidas");
    }
}
