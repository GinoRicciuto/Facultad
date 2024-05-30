package Jardin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Planta> jardin = new ArrayList<Planta>();
        Planta p1 = new Planta("Rosalia","Rosa","Australia","3 febrero");
        Planta p2 = new Planta("Suculentus","Suculenta","Inglaterra","6 de otonio");
        Planta p3 = new Planta("Petunius maximus","Petunia","Argentina","5 de almagro");
        jardin.add(p1);
        jardin.add(p2);
        jardin.add(p3);
        System.out.println("Plantas en el jardin: ");
        for (Planta planta : jardin){
            System.out.println("La planta id: "+planta.getId()+" es la "+planta.getNombre_cientifico()+" y fue adquirida el "+planta.getFecha_compra());
        }
        System.out.println("No hay mas plantitas papi");
    }
}
