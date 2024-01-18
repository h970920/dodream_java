package basic_API_90;

import java.util.*;

//날짜에서 세부 정보를 제공하는 Calendar 클래스 사용법
public class Ex40_Calendar {
  public static void main(String[] args) {
    
    Calendar cal = Calendar.getInstance();//현재시간의 정보를 가진 객체 생성
    //Calendar greCal = new GregorianCalendar();//다른시간대의 날짜와 시간을 출력가능
    
    //날짜와 시간을 아래와 같이 설정
    cal.set(2002,3,5,10,30,25); //월은 0~11 이기 때문에 1 작은수를 입력해야함 
    
    
    System.out.println("1." + cal);
    
    //년월일 - get(상수) 메소드를사용하면 int 타입으로 리턴
    
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);//0~11
    int date = cal.get(Calendar.DAY_OF_MONTH);//월마다 일수가 다르기 때문이다
    System.out.printf("2. %d년 %d월 %d일\n", year,month+1,date);
    
    //시분초
    
    int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    
    System.out.printf("3. %d시 %d분 %d초\n",hour,minute,second);
 
    //요일
    
    int day = cal.get(Calendar.DAY_OF_WEEK);//1~7(일~토)
    
    String[] dayName = {"","일","월","화","수","목","금","토"};
    
    System.out.printf("4. 오늘은 %d요일\n", day);
    System.out.printf("4. 오늘은 %s요일\n", dayName[day]);
    
    //국가별 월, 요일정보 -> .getDisplatName(보여줄항목,문자열길이타입,지역정보);
    //Long,Short 선택에 따라 -> 1또는 1월, 월 or 월요일 중 하나가 출력됨
    String krMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);
    String krDay = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG ,Locale.KOREA );
    
    System.out.printf("5. 한국 : %s %s" , krMonth,krDay);
  }//main
}