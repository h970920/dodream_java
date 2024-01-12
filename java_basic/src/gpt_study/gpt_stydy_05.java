package gpt_study;

import java.util.Arrays;
import java.util.Scanner;

public class gpt_stydy_05 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //배열의 길이 입력받기
    System.out.println("배열의 길이를 정해주세요");
    int leng = sc.nextInt();
    int arr[] = new int[leng];
    
    //배열안의 값 입력받기
    for(int i = 0 ;  i < arr.length; i++) {
      System.out.println("값을 입력해주세요");
      arr[i] = sc.nextInt();
    }
    
    //배열 내림차순 정렬하기 
    for(int i = 0 ; i < arr.length-1 ; i ++) {
      for(int j = 0; j < arr.length-1-i ; j++) {
        if(arr[j]<arr[j+1]) {
          int num = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = num;
        }
      }
    }
    //배열을 문자열로 변환해서 출력
    System.out.println("내림차순 정렬을 완료했습니다 " +Arrays.toString(arr));
   
    
    //배열 오름차순 정렬하기 ,, [1,2,3]
   Arrays.sort(arr);
 
   
    
    //배열을 문자열로 변환해서 출력
   System.out.println("오름차순 정렬을 완료했습니다 " +Arrays.toString(arr));
   
    
    
   } // end of main

}
