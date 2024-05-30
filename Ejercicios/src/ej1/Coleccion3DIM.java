package ej1;

public class Coleccion3DIM {
    private final Object[][][] objetos;
    public Coleccion3DIM(){
        objetos = new Object[10][10][10];
    };
    public void cargarObjeto(int x, int y, int z, Object nuevoObjeto){
        if (x>= 0 && x<= 10 && y>= 0 && y<= 10 && z>= 0 && z<= 10){
            objetos[x][y][z] = nuevoObjeto;
        }
    }
    public Object obtenerObjeto(int x, int y, int z){
        if (x>= 0 && x<= 10 && y>= 0 && y<= 10 && z>= 0 && z<= 10){
            return objetos[x][y][z];
        }
        else{
            return "error";
        }
    }

}
