package Factory.Creadores;

import Factory.Creadores.personajes;
import Factory.Productos.ArmaOrco;
import Factory.Productos.ArmaduraOrco;
import Factory.Productos.CascoOrco;
import Factory.Productos.Implemento;

public class Orco extends personajes {
    
    public Orco(){
      super(300,20,100,30);  
      super.imgP = "Img/Orco.png";
      super.imgC = "Img/NoAplica.png";
      super.imgA = "Img/ArmaOrco.png";
      super.imgAD = "Img/ArmaduraOrco.png"; 
    }
    
    
    @Override
    public Implemento factoryMethod() {
      this.armadura =new ArmaduraOrco().agregar();
      this.casco = new CascoOrco().agregar();
      this.daño = new ArmaOrco().agregar();
        return new ArmaduraOrco();
    }
    
}
