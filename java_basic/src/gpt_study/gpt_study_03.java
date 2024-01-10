package gpt_study;


import java.util.Scanner;

public class gpt_study_03 {
public static void main(String[] args) {
  //  사용자로부터 문자열을 입력 받아 거꾸로 출력하는 프로그램 작성.
  
  String[] strArray = new String[3]; //배열선언
  String[] reverse = new String[3];  // 역배열 선언
  
  //배열에 값 입력
  for(int i=0 ; i < strArray.length; i++) {
  Scanner sc = new Scanner(System.in);
  System.out.println("문자열을 입력하세요");
  strArray[i] = sc.next();

  }
  for (int j= strArray.length-1, a=0; j>=0; j--,a++  ) {
    reverse[a] = strArray[j];
  }
  //배열 출력
  for(int i=0; i<strArray.length; i++) {
    System.out.println("입력값은 = " + strArray[i]);
  }
  for(int i=0; i<strArray.length; i++) {
  System.out.println("역배열 값은 = " + reverse[i]);
  }
  
  
  
}
}
