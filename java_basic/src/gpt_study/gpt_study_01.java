package gpt_study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gpt_study_01 {
  public static void main(String[] args) {
    /*
        기본 문법 및 데이터 타입 활용:
        두 정수를 입력 받아 합을 출력하는 프로그램 작성.
      
     */
     /*   Scanner sc =new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int a=sc.nextInt();
        System.out.println("a 값은 = " + a);
        System.out.println("정수를 입력하세요");
        int b=sc.nextInt();
        System.out.println("b 값은 = " + b);
        
        int add = a+b;
        System.out.println("두 수의 합은" + add + "입니다.");  */
        
    
    
        //try , catch문을 이용하여 작성해보기
        
        Scanner ac =new Scanner(System.in);
        try {//예외발생할 가능성이 있는 문장
          System.out.println("첫번째 정수를 입력하세요");
          int a= ac.nextInt();
          System.out.println("두번째 정수를 입력하세요");
          int b= ac.nextInt();
          
          int add = a+b;
          System.out.println("두 수의 합은 " + add + " 입니다." );
        }
          catch(InputMismatchException e) {//Exception이 발생했을 경우, 이를 처리하지 위한 문장적는다.
          
            System.out.println("정수를 입력해야 합니다 프로그램을 종료합니다");
          }
          finally {
            ac.close();
          }
       
  
        
            

    
    
  }

}
