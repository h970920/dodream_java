package variable_10;


//연산결과에 따른 형변환
public class Ex70_Casting {

    public static void main(String[] args) {
      
      double a = 10.5d;//8바이트 실수, d 생략 가능.
      float b = 20.5f;//4바이트 실수
      
      /*
       * 큰 범위의 변수와 작은 범위의 변수가 연산을 수행하면,
       * 작은 범위의 변수가 큰 범위의 데이터형으로 암묵적 형변환을 수행한다.
       * 그러므로 아래의 a+b는 double형의 변수가 되므로
       * float 형의 값에 대입하는 것은 에러이다. >> 명시적 형변환 하기!
       */
      
      float result = (float) (a + b);
    
      System.out.println("result = " + result);
    }
}
