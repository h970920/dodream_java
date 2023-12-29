package hyun_woo;
import java.util.*;
public class 현우메이드 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("가위바위보게임을 시작합니다.");
    String num[] = new String[] {
        "가위","바위","보"
    };
    String name[] = new String[] {
        "사용자","컴퓨터"
    };
//    -1 , 2: 컴퓨터 승
//     1, -2: 유저.승
    while(true) {
      System.out.println("1.가위 2. 바위 3. 보 9. 나가기" );
      int user = s.nextInt()-1; //user 변수에값을 입력 받음. 1
      int com = (int)(Math.random()*3); //computer변수에 값을 입력받음. 2
      System.out.println("사용자가 입력한 값은 : " + num[user] + " / 컴퓨터가 입력한 값은 :"+ num[com]);
      
      int sum = user - com+1;
      if( sum== 1) {
        System.out.println("비겼습니다.");
      }else if( sum == -1 || sum == 2) {
        System.out.println(name[0]+"가 이겼습니다.");
        
      }else {
        System.out.println(name[1]+"가 이겼습니다.");
      }
      
      
    }

    
    
  }
}
