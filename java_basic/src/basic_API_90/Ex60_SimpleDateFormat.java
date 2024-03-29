package basic_API_90;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * 날짜,시간정보를 원하는 형식의 문자열로 변환
 * SimpleDateFormat sdf = new SimpleDateFormat("포멧형식");
 * 
 * 1.포멧형식 yyyy-MM-dd E HH:mm:dd
 * 
 * yyyy - 4자리 연도
 * MM - 2자리 월
 * dd - 2자리 일(이달중에 몇번째 날인지 - Day_Of_Month)
 * E - 요일
 * H - 24시간
 * mm - 2자리 분
 * ss - 2자리 초
 */


public class Ex60_SimpleDateFormat {
  public static void main(String[] args) {
    
    System.out.println("SimpleDateFormat 을 이용한 날짜시간 출력");

    Calendar cal = Calendar.getInstance();
    Date date = cal.getTime();
    
    if(false) {
    
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
      String Now = sdf.format(new Date());
      System.out.printf("지금은 %s입니다\n", Now);
    }
    
    if(true) {
      SimpleDateFormat sdf = new SimpleDateFormat("지금은 yyyy년 MM월 dd일 E요일 HH시 mm분 ss초 입니다");
      String now = sdf.format(date);
      System.out.println(now);
    }
  }
}