package hyun_woo;

import java.util.Scanner;
// 입력받은 배열의 모든 요소의 합을 계산하는 메소드를 작성하세요. 
public class day_03_혼자공부하기 {
  public static void main(String[] args) {
    
    
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    
    for ( int i = 0;  i < arr.length ; i++) {
      System.out.println("값을 입력하세요");
      arr[i]=sc.nextInt();
    }
    
    int sum = 0;
    for (int num:arr) {
        sum += num;
    }
      System.out.println(sum);
    
    
  }
}
