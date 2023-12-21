package loop_40;

//연습문제 - 3의 배수 이면서 5의 배수 찾기

/**
*-------------------------------------------------
* 1부터 100까지의 자연수 중에서 3의 배수이면서 동시에 5의 배수인 숫자를 출력하여보자.
* 
* [출력결과 예시]
*--------------------------------------------------
* 15
* 30
* 45
* 60
* 75
* 90
*/
public class Ex80_homework {

  
  public static void main(String[] args) {
    
    
  
  for (int i = 1; i<=100; i++) {
    if (i%15 == 0) {
      System.out.println(i);
    }
     
  }
  
  // 다르게 풀어보기 
    int x = 3;
    int y = 5;
  for (int i = 1; i<=6; i++) {
    int z=(x*y*i );
      System.out.println(z);
    
  }
  
}
} 
  

  
  
  
  

