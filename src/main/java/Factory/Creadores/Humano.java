package Factory.Creadores;

import Factory.Creadores.personajes;
import Factory.Productos.ArmaHumano;
import Factory.Productos.ArmaduraHumano;
import Factory.Productos.CascoHumano;
import Factory.Productos.Implemento;

public class Humano extends personajes{
    
    public Humano(){
      super(100,100,50,50); 
      super.imgP = "Img/Humano.png";
      super.imgC = "Img/CascoHumano.png";
      super.imgA = "Img/ArmaHumano.png";
      super.imgAD = "Img/ArmaduraHumano.png"; 
    }
    
    @Override
    public Implemento factoryMethod() {
      this.armadura = new ArmaduraHumano().agregar();
        this.casco = new CascoHumano().agregar();
        this.daño =  new ArmaHumano().agregar();
        return new ArmaduraHumano();
    }
}
