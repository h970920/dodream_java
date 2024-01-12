package extends_60.components;

public class Navy extends Unit {
  public void attack() {
    System.out.println(super.getName()+ ">> 지상공격 실행함 ");
  }
  
  public void submarin() {
    System.out.println(super.getName() + ">> 잠수함 공격");
  }
}
