package hyun_woo;
import java.util.*;
public class 이중배열 {
   public static void main(String[] args) {
    String sum[][] = new String[][] {
        {"비김","컴퓨터이김","사용자이김"},
        {"사용자이김","비김","컴퓨터이김"},
        {"컴퓨터이김","사용자이김","비김"}
    };
    String num[] = new String[] {
      "가위","바위","보"  
    };
    System.out.println("가위바위보게임을 시작합니다.");
      while(true) {
     System.out.println("1.가위 2. 바위 3. 보 9. EXIT" );
     Scanner s = new Scanner(System.in);
     int user = s.nextInt()-1;
     if(user == 8)
       break;
     int com = (int)(Math.random()*3);
     System.out.println("사용자가 입력한 값은 : " + num[user] + " / 컴퓨터가 입력한 값은 :"+ num[com]);
     System.out.println(sum[user][com]);
      }
  }
}
