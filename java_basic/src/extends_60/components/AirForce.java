package extends_60.components;

public class AirForce extends Unit {
  public void attack() {
    System.out.println(super.getName() + ">> 이륙 ");
    System.out.println(super.getName() + ">> 공중공격 실행함 ");
  }
  
  public void plane() {
    System.out.println(super.getName() + ">> 폭격 ");
  }
}
