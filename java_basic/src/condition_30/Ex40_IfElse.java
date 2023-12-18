package condition_30;

import java.util.Scanner;

public class Ex40_IfElse {
//if~else 모 아니면 도 
  public static void main(String[] args) {
    
    System.out.println("토익 점수를 입력해주세요");
    
   Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    
    if(score >= 600) {
        System.out.println("영어 좀 치시네요");
    } else {
      System.out.println("보충학습 후 다시 도전해보세요");
    }
  } 
}
