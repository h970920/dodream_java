package gpt_study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gpt_study_02 {
  public static void main(String[] args) {
   // 반지름을 입력 받아 원의 넓이를 계산하는 프로그램 작성.
 
    
    Scanner sc = new Scanner(System.in);
    try {
    System.out.println("r 값을 입력하세요");
    double r = sc.nextDouble();
    double p = Math.PI;
    double c = r*r*p;
    System.out.println("원의 넓이는 " + c + " 입니다");
    }
    catch(InputMismatchException e){
      System.out.println("올바른 값을 입력해주세요. 프로그램을 종료합니다.");
    } finally {
      sc.close();
    }
  }
}
