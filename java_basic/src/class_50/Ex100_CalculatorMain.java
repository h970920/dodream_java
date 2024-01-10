package class_50;

class test{
  
  public int x;
  public int y;

  // 아래의 plus() 메소드 호출이 잘 작동하도록 오버로딩 하시오
  public void plus(int x, int y) {
    System.out.println("정수 덧셈 결과: " + (x + y));
  }

  public void plus(float x, float y) {
    System.out.println("실수 덧셈 결과: " + (x + y));
  }

  public void plus(double x, double y) {
    System.out.println("더블 덧셈 결과: " + (x + y));
  }
} 
 
public class Ex100_CalculatorMain {

  public static void main(String[] args) {
    
    test cal = new test();
    cal.plus(3, 5);
    cal.plus(0.1f, 0.2f);
    cal.plus(0.5d, 0.7d);
  }
}
