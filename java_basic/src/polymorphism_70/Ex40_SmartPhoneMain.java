package polymorphism_70;

//다향성 - 클래스의 업캐스팅 규칙을 설명하는 예제

interface SmartPhone{
  String screen();
  String button();
}

class Samsung implements SmartPhone{

  @Override
  public String screen() {
    return "삼성 스크린";
  }

  @Override
  public String button() {
    return "삼성 버튼";
  }
  
}


class LG implements SmartPhone{

  @Override
  public String screen() {
    return "엘지 스크린";
  }

  @Override
  public String button() {
    return "엘지 버튼";
  }
    
}

class IPhone implements SmartPhone{

  @Override
  public String screen() {
    return "아이폰 스크린";
  }

  @Override
  public String button() {
    return "아이폰 버튼";
  }
  public String Sound() {
    return "아이폰 사운드";
  }
  
}



public class Ex40_SmartPhoneMain {
 public static void main(String[] args) {
   
   SmartPhone sm_1 = new Samsung();
   SmartPhone lg_1 = new LG();
   SmartPhone iphone_1 = new IPhone();
   
   //부모의 타입으로 자식의 오버라이딩한 메소드를 호출할 수 있다.
   System.out.println(sm_1.screen());
   System.out.println(lg_1.screen()); 
   System.out.println(iphone_1.screen());
  // System.out.println(iphone_1.sound()); 오버라이드한 메소드만 호출할수있다.
   
  Samsung sm = new Samsung();
  LG lg = new LG();
  IPhone iphone = new IPhone();

  //삼성 메소드 실행
    System.out.println(sm.button());
    System.out.println(sm.screen());
    
    
  
  System.out.println("-----------------");  
    
  //LG 메소드 실행
  System.out.println(lg.button());
  System.out.println(lg.screen());
  
    System.out.println("-----------------"); 
    
  //IPhone 메소드 실행
    System.out.println(iphone.button());
    System.out.println(iphone.screen());
    
  
}
}