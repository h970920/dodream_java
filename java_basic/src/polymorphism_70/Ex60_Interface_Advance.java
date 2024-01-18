package polymorphism_70;

interface Telecoms{
  void beeper();
  //JDK8 이후 문법
  //인터페이스를 상속죽인 여러러개의 하위 클래스중 특정 클래스만을 위한 메소드를 추가하고 싶을때 사용. (default)1
 default void alram() {
   System.out.println("default 키워드 사용시 추가되더라도 의무적으로 하위 클래스에서 오버라이딩 하지 않아도 됨.");
 }
 //JDK8 이후 문법
 //구현 상태로 제공
 static void must() {
   System.out.println("static 키워드 사용시 하위 클래스는 오버라이딩이 불가능하며 구현상태 그대로 사용해야함");
 }
}



class SK implements Telecoms {

  @Override
  public void beeper() {
    System.out.println("SK 클래스에서 beeper() 메소드 오버라이딩 ~!");
  }

  @Override
  public void alram() {
    System.out.println("따르릉 따르릉 ~");
  }




}

public class Ex60_Interface_Advance {

  public static void main(String[] args) {
    //Telecoms 인터페이스에서 alarm(),must() 가 추가되었지만 
    // default , static으로 되어 있기 때문에 별도의 sk클래스는 별도의 추가 작업이 필요없다.
    SK sk = new SK();
    sk.beeper();
    sk.alram();
    Telecoms.must();
  }
  
}
