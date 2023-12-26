package hyunWooHomeWork;

import java.io.FileInputStream;
import java.util.ArrayList;
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
      
      Human[] h = new Human[5];
       System.out.println("학생관리 프로그램에 오신걸 환영합니다.");
       System.out.println("메뉴를 선택해주세요 . 1. 학생 입력 2. 학생수정 3. 학생 삭제 4. 학생 정렬");
       
       ArrayList<String> a = new ArrayList<>();
       try {
         FileInputStream fileInputStream = new FileInputStream("파일경로");
     } catch (Exception e) {
         e.printStackTrace();
     }

     // Human 객체 생성
     Human human = new Human();
     human.arm = 2;
      
      
    
    }
  }


