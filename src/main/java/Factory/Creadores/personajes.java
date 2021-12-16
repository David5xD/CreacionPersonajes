package Factory.Creadores;

import Factory.Productos.Implemento;
import java.util.ArrayList;

public abstract class personajes {

    int vida;
    int mana; 
    int fuerza;
    int velocidad;
    int armadura;
    int casco;
    int daño;
    int velAnimal;
    String imgP;
    String imgA;
    String imgC;
    String imgAD;
    String imgAn;
    
    public personajes(int v, int m, int f, int ve){
        this.vida=v;
        this.mana=m;
        this.fuerza=f;
        this.velocidad=ve;
    }
    public Implemento AgregarImplemento(){
        return factoryMethod();
    }

    public abstract Implemento factoryMethod();
    
    
    public ArrayList piezas(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(Integer.toString(vida));
        lista.add(Integer.toString(mana));
        lista.add(Integer.toString(fuerza));
        lista.add(Integer.toString(velocidad));
        lista.add(Integer.toString(armadura));
        lista.add(Integer.toString(casco));
        lista.add(Integer.toString(daño));
        lista.add(imgP);
        lista.add(imgC);
        lista.add(imgA);
        lista.add(imgAD);
        lista.add(imgAn);
        lista.add(Integer.toString(velAnimal));
        return lista;
    }
}
