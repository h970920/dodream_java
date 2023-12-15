package condition_30;

import java.util.Scanner;

public class Ex20_If_Simple {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("몇 점?");
    int myScore=sc.nextInt();
    
    if (myScore >= 70 && myScore<=80)
    {
    System.out.println("C학점 입니다.");
    }
    if (myScore <70 || myScore >=80) {
      System.out.println("범위를 벗어났습니다.");
    }
      
  }
}
