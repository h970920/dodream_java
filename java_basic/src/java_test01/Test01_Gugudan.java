package java_test01;

import java.util.Scanner;

public class Test01_Gugudan {
public static void main(String[] args) {
  //1.단을 입력합니다
  Scanner sc = new Scanner(System.in);
      System.out.println("구구단 몇 단 ?");
      int dan = sc.nextInt();
      
   //2.구구단은 2단에서 9 단까지만 가능합니다
      if(dan<2 || dan>9) {
        System.out.println("구구단은 2단~9단까지만 선택할 수 있습니다. 프로그램을 종료합니다");
        sc.close();
        return;
      }
      
      //3.구구단을 출력합니다.
      for (int i =1 ; i<10; i++) {
        System.out.println(dan +" * " + i +" = " + (dan*1));
      }
      
      //4.스캐너를 닫습니다.
      sc.close();
}
  
}
