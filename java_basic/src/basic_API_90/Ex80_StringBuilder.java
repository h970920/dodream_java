package basic_API_90;

public class Ex80_StringBuilder {
public static void main(String[] args) {
  //실험 1 -string
  
  String result = "";
  
  //시작시간 
  long startTime = System.currentTimeMillis(); //시작시간
  
  for(int i=0; i<1000; i++) {
    result += "duly.";
  }
  long endTime =System.currentTimeMillis();// 종료시간
  long duration = endTime -startTime;
  
  System.out.println(("1.String 연결작업 소요시간 =" + duration));
  
  //실험 2 -StringBulider 
  
  StringBuilder sb = new StringBuilder();
  
   startTime = System.currentTimeMillis(); //시작시간
  for (int i = 0; i <1000 ; i ++) {
    sb.append("duly.");
    
    
  }
  
 endTime =System.currentTimeMillis();// 종료시간
  duration = endTime -startTime;
  
  result = sb.toString();
  System.out.println("2.StringBuffer 연결작업 소요시간 = " + duration);
  
}
}
