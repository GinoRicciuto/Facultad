package CienciasDeComputacion;

public class Main {
    public static void main(String[] args){
        Congreso nuevo = new Congreso("Ciencias1");
        Poster p1 = new Poster("tp1");
        nuevo.agregarTrabajo(p1);
    }
}
