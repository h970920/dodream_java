package operator_20;

//논리연산자
public class Ex70_Operator {
  
  public static void main(String[] args) {
    
    int a = 100;
    int b = 200;
    int c = 300;
    
    int x = 5;
    int y = 3;
    
    //논리연산에 대한 결과는 boolean 이다.
    boolean result1 = a != b || a == b;
    
    boolean result2 = a < b || x > y;
    
    System.out.println("1. result1 = " + result1);//true
    System.out.println("2. result2 = " + result2);//true
  
  }//end of main

}
