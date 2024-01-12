package extends_60;

interface Fight{
  void attack(); // public abstract 생략
  void shield();
}

interface Move {
  void walk();
  void run();
  void jump();
}

interface Item {
  void weapon();
}

class Hero implements Fight, Move, Item {
  private String name;
  
  public Hero(String name) {
    this.name=name;
  }

  @Override
  public void weapon() {
    System.out.println(this.name + " >> 무기 추가");
    
  }

  @Override
  public void walk() {
    System.out.println(this.name + " >> 걷고 ");
    
  }

  @Override
  public void run() {
    System.out.println(this.name + " >> 뛰고 ");
    
  }

  @Override
  public void jump() {
    System.out.println(this.name + " >> 점프 ");
    
  }

  @Override
  public void attack() {
    System.out.println(this.name + " >> 공격 ");
    
  }

  @Override
  public void shield() {
    System.out.println(this.name + " >> 방어 ");
    
  }
  
  
}
class Villain implements Fight, Move {
  private String name;
  
  public Villain(String name) {
    this.name=name;
  }

  @Override
  public void walk() {
    System.out.println(this.name + " >> 걷다 ");
    
  }

  @Override
  public void run() {
    System.out.println(this.name + " >> 뛰다 ");
    
  }

  @Override
  public void jump() {
    System.out.println(this.name + " >> 점프하다 ");
    
  }

  @Override
  public void attack() {
    System.out.println(this.name + " >> 공격(호잇)하다 ");
    
  }

  @Override
  public void shield() {
    System.out.println(this.name + " >> 막다 ");
    
  }
  
  
}

public class Ex60_Marble {
  public static void main(String[] args) {
    
    Hero thor = new Hero("토르");
   thor.walk();
   thor.run();
   thor.attack();
   thor.shield();
   System.out.println("-------------------"); 
   
   Villain duly = new Villain("둘리");
   duly.walk();
   duly.run();
   duly.attack();
   duly.shield();
   
   System.out.println("-------------------"); 
   thor.jump();
   thor.weapon();
   
  }

}
