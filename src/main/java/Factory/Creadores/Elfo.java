package Factory.Creadores;

import Factory.Creadores.personajes;
import Factory.Productos.ArmaElfo;
import Factory.Productos.ArmaduraElfo;
import Factory.Productos.CascoElfo;
import Factory.Productos.Implemento;

public class Elfo extends personajes {
       
    public Elfo(){
      super(75,200,25,75);  
      super.imgP = "Img/Elfo.png";
      super.imgC = "Img/CascoElfo.png";
      super.imgA = "Img/ArmaElfo.png";
      super.imgAD = "Img/ArmaduraElfo.png";
      
    }
    
    @Override
    public Implemento factoryMethod() {
        this.armadura =   new ArmaduraElfo().agregar();
        this.casco =  new CascoElfo().agregar();
        this.daño =   new ArmaElfo().agregar();
        return new ArmaduraElfo();
    }
    
}
