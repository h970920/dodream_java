package basic_API_90;
/*
 * Math 클래스는 수하고가 관련된 여러가지 메소드를 가지고 있다.
 * 모든 클래스가 스태틱 형태이기 때문에, 객체 생성 필요없음
 * 
 */


public class Ex90_Math {

  //특정범위의 정수를 리턴하는 메소드
  public static int myRandom(int a, int b) {
    return (int)(Math.random()*(a-b)+1)+b;
    
  }
  
  public static void main(String[] args) {

    myRandom(1,10);

    // myRandom() 메소드를 활용하여 5자리 인증번호 생성하기
    String certiNum = "";
    
    for(int i =0; i<5; i++) {
      certiNum += myRandom(0,9);
    }
    
    System.out.println("인증번호 = " + certiNum);
    
    //두수중 최대값 구하기
     int max = Math.max(100, 9999);
     System.out.println("max = " + max);
     //최소값 구하기
     
     int min = Math.min(100 , 9999);
     System.out.println("min = " + min);
     
     //절대값
     int abs = Math.abs(-234);
     System.out.println("abs = " + abs);
     //반올림
     Long roundnum = Math.round(3.14159);
     System.out.println("roundnum = " + roundnum);
     //0-1사이
     System.out.println(Math.random());
     
     //0~10 추출
     int result = (int)(Math.random()*11);
     System.out.println("result = " + result);
  
     //1 ~ 10 추출
     int result2 = (int)(Math.random()*10+1);   
     System.out.println("result2 = " + result2);
  }
}