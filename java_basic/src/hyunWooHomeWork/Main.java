package hyunWooHomeWork;

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
      //학생관리 프로젝트
      Scanner s = new Scanner(System.in);
      User  u = new User();
      while(true) {
         System.out.println("아이디를 입력해주세요");
         String id = s.next();
         System.out.println("비밀번호를 입력해주세요");
         String pw = s.next();
         if(u.idMcth(id, pw)) {
           break;
         }else {
           System.out.println("아이디 비밀번호가 다릅니다.");
         }
        
      }
      System.out.println("로그인 성공");
      
      
    
    }
  }


