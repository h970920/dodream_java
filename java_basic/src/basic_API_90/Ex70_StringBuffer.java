package basic_API_90;

public class Ex70_StringBuffer {

  public static void main(String[] args) {
    
      String str1 = "hello ,"; //100번지
      String str2 = "world~!";// 200번지
      
   //   String result = str1 + str2;
      str1 = str1.concat(str2); //300번지
      System.out.println(str1);
      
      /*
       * .concat() 메소드는 문자열을 연결하는 가장 간단한 방법이다
       * 그러나 문자열을 대량으로 연결할 때는 더 효율적인 방법으로 Stringbulider나 StringBuffer클래스를 사용하는 것이 좋을 수 있다.
       * 
       */
      
      str1 = "아기공룡"; //400번지
      str2 = "둘리"; // 500번지
      
      StringBuffer sb = new StringBuffer(); //600번지
      sb.append(str1);
      sb.append(str2);
      
  }
}
