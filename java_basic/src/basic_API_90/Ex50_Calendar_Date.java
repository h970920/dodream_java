package basic_API_90;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/*
 * Calendar 클래스에서 꼭 알아둬야 할 메소드
 * 
 * .getTime() -> Date 객체를 리턴
 * .setTime() -> Date 객체를 이용해서 특정시점의 Calendar 날짜정보로 설정
 */


public class Ex50_Calendar_Date {
  
  public static void main(String[] args) {
    
   // 1. Calendar를 이용한 Date 날짜 객체 생성
    Calendar cal = new GregorianCalendar();
    Date date = cal.getTime();
  
    
   // 2. Date 객체를 Calendar 특정시점의 날짜정보 설정시 사용 
    Date oneDay = new Date(1324565551235L);
    System.out.println("1. oneDay = " + oneDay);
    
    Calendar oneDayCal = new GregorianCalendar();
    oneDayCal.setTime(oneDay);
    System.out.println("oneDayCal = " + oneDayCal);
  }
}