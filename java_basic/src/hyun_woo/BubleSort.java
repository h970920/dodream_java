package hyun_woo;

public class BubleSort {
  public static void priFn(int[] num) {
    for(int i= 0 ; i<num.length; i++) {
      System.out.println(i + "번쨰 변수에는 " + num[i] );
    }
  }
  public static void main(String[] args) {
    int number[] = new int[] {
        32,42,23,1,23,43,32,34,5,535
    };
    priFn(number);
    
    System.out.println("-----------------값정렬을 완료했습니다.--------------------");
    // 배열을 정렬하는 알고리즘 작성
      for(int a = 0 ; a < number.length; a++ ) {
         
      }
    
    
    
    priFn(number);
    
  }

}
