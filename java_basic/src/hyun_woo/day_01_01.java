package hyun_woo;

import java.util.Random;
import java.util.Scanner;

public class day_01_01 {

  public static void main(String[] args) {
    
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("가위바위보 게임을 시작합니다");
     
         //랜덤값 출력
         while(true) { 
           
           System.out.println("1.가위  2.바위  3.보  9.종료하기"); 
               int a =sc.nextInt();
               int[] com = new int[3];
               
               if(a==9) {
                 System.out.println("게임을 종료합니다");
                 break; } //바로 게임 종료하는경우
               
           for(int i=0; i<1; i++) {
             com[i] = random.nextInt(3)+1;
             if (com[i]==1) {
               System.out.println("컴퓨터: 가위");
             } else if (com[i]==2) {
               System.out.println("컴퓨터 : 바위");
             } else if (com[i]==3) {
               System.out.println("컴퓨터 : 보");
             } //컴퓨터가 가위,바위,보를 랜덤으로 출력
             
                     int b=1; // 사용자 가위
                     int c=2; // 사용자 바위
                     int d=3; // 사용자 보
             
              if( a == b) {
                 System.out.println("사용자 : 가위");
               } else if(a == c) {
                 System.out.println("사용자 : 바위");
               } else if ( a == d) {
                 System.out.println("사용자 : 보");
                   }
              
                if(a==1 && com[i]==3) {
                System.out.println("사용자가 이겼습니다");
              } else if (a==3 && com[i]==1) {
                System.out.println("사용자가 졌습니다");
              }
                else if(a>com[i]) {
                System.out.println("사용자가 이겼습니다");
              } else if ( a== com[i]) {
                System.out.println("비겼습니다");
              } else if (a<com[i]) {
                System.out.println("사용자가 졌습니다");
              }
               
           
               }   // end of for
           if(a==9) {
             System.out.println("게임을 종료합니다");
             break;
           } // 게임하다가 종료해버리기
         } // end of while
        
              
    
    
    
    
  }
}
