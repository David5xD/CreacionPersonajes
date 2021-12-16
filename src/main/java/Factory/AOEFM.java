package Factory;


import Factory.Creador;
import Factory.Creadores.Elfo;
import Factory.Creadores.Humano;
import Factory.Creadores.Orco;
import Factory.Creadores.personajes;
import Factory.Productos.Implemento;
import java.util.ArrayList;


public class AOEFM implements Creador{

    personajes creador;
    Implemento producto;
    ArrayList<String> aux;
    @Override
    public void operacion(int opcion,int cantidad) {
        switch (opcion){
        case 0:
        for (int i=1; i<=cantidad;i++){
        creador = new Humano();
        producto = creador.AgregarImplemento();
        producto.agregar();}
        aux= creador.piezas();
        break;
        case 1:
        for (int i=1; i<=cantidad;i++){
        creador = new Orco();
        producto = creador.AgregarImplemento();
        producto.agregar();}
        aux= creador.piezas();
        break;
        case 2:
        for (int i=1; i<=cantidad;i++){
        creador = new Elfo();
        producto = creador.AgregarImplemento();
        producto.agregar();}
       aux= creador.piezas();
        break;
        }   
        salida();
    }
    public ArrayList salida(){
           return aux; 
        }
}
