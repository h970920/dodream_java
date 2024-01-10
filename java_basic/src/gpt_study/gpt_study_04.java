package gpt_study;

import java.util.Arrays;
import java.util.Scanner;

public class gpt_study_04 {

  public static void main(String[] args) {
    
   
    
   
     int arr[] = new int [3];
    Scanner sc = new Scanner(System.in);
    
    //배열에 값 입력받음
    for (int i = 0 ; i<arr.length ; i++) {
        
        System.out.println("값을 입력하세요");
        arr[i] = sc.nextInt();
    }
    
    //버블정렬로 내림차순 정렬
    for ( int i = 0 ; i<arr.length-1 ; i++) {
      for ( int j =0; j<arr.length-1-i ; j ++) {
        if(arr[j] < arr[j+1]) {
          int num = arr[j];
              arr[j] = arr[j+1];
                  arr[j+1] = num;
        }
      }     
    }

    //어레이 투스트링으로 배열을 문자열로 변환
    System.out.println("내림차순한 arr 배열의 값들 = " + Arrays.toString(arr)); 
    
    /*
     * Arrays.toString(arr);
      위 코드에서는 배열의 값을 출력하기 위해서
       java.util.Arrays.toString() 메소드를 사용하였습니다.
      java.util.Arrays.toString() 메소드는 파라미터로 배열을 입력받아서, 
      배열에 정의된 값들을 문자열 형태로 만들어서 리턴해 줍니다.
     */  
    
    
  }
  
}
