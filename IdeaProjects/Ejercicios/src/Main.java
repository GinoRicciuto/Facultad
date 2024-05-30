import ej4.*;

public class Main {
    private static AlarmaSonora alarma;
    public static void main(String[] args) {
        alarma = new AlarmaSonora();
        Sensor sens1 = new Sensor("Living");
        Sensor sens2 = new Sensor("Patio");
        Sensor sens3 = new Sensor("Cocina");
        alarma.agregarSensor(sens1);
        alarma.agregarSensor(sens2);
        alarma.agregarSensor(sens3);
        sens2.detecto();
        alarma.comprobar();

    }

}
