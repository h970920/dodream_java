package extends_60.components;

public class Army extends Unit{

  public Army(String string) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void attack() {
    System.out.println(super.getName()+ ">> 지상공격 실행함 ");

  }
  
  public void tank() {
    System.out.println(super.getName() + " >> 탱크공격 ");
  }
}
