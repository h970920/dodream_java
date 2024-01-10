package extends_60;

class Car {
  public void carSound() {
    System.out.println("1. Car : 빵~빵!");
  }
}

class Sedan extends Car {
  public void sedanSound() {
    System.out.println("2. Sedan : 빠바방!");
  }
}

class SM extends Sedan {
  public void smSound() {
    System.out.println("3. SM : 빵라빠뽕~빵!");
  }
}

public class Ex10_CarMain {
  public static void main(String[] args) {
    int num = 100;
    System.out.println(num);
    
    SM sm = new SM();
    sm.smSound();
    sm.sedanSound();
    
    Sedan sedan = new Sedan();
    sedan.carSound();
    sedan.sedanSound();
  }

}
