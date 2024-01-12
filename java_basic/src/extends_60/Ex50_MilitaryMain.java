package extends_60;

import extends_60.components.AirForce;
import extends_60.components.Army;
import extends_60.components.Navy;

public class Ex50_MilitaryMain {
  public static void main(String[] args) {
    
    Army army = new Army();
    army.setName("육군");
    army.attack();
    army.tank();
    
   System.out.println("---------------------------------");
    
    AirForce airforce = new AirForce();
    airforce.setName("공군");
    airforce.attack();
    airforce.plane();
    
    System.out.println("---------------------------------");
    
    Navy navy = new Navy();
    navy.setName("해군");
    navy.attack();
    navy.submarin();
    
   
    
  }
}
