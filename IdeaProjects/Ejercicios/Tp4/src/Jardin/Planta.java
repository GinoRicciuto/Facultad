package Jardin;

public class Planta {
    private String nombre_cientifico;
    private String nombre_comun;
    private String pais_origen;
    private String fecha_compra;
    private int id;
    private static int nro_plantas = 0;

    public Planta(String nombre_cientifico, String nombre_comun, String pais_origen, String fecha_compra) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;
        this.pais_origen = pais_origen;
        this.fecha_compra = fecha_compra;
        id = nro_plantas;
        nro_plantas++;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public int getId() {
        return id;
    }

    public static int getNro_plantas() {
        return nro_plantas;
    }
}
