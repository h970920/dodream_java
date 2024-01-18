package array_80;

public class Ex10_Array {

  public static void main(String[] args) {
      String name;
    
    //js에서는 const arr = [1,2,3];
      
      // 자바 배열의 특징
      // 1.단수히 양적인 저장공간
      // 2.배열의 크기를 변경할 수 없다. ( 자바 스크립트는 가능 )
      // 3.배열 선언시 크기를 지정해야함 ( 자바스크립트는 하지않는다)
      // 4.배열의 길이는 "배열명.length"로 선언
      // 배열 선언시 크기를 지정해야함
   int num[] = new int[3];
   
   num[0] = 75;
   num[1] = 82;
   num[2] = 91;
   
   //전통적인 for문을 사용하여 배열의 아이템 출력
   for(int i = 0 ; i<num.length ; i++) {
     System.out.println(num[i]);
   }
   
   //배열 생성시 일괄 값할당
   int score[] = new int[] {100,80,90};

   //어드밴스드한 for문을 사용하여 배열의 아이템 출력
   for(int value : score) {
       System.out.println(value);
   }
  }//main
}
