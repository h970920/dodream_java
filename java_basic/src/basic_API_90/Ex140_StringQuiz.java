package basic_API_90;

public class Ex140_StringQuiz {

  public static void main(String[] args) {

    // 이메일 주소에서 아이디와 도메인 추출하기
    String email = "duly@korea.com";

    String email_id = "";
    String email_domain = "";

    // 방법1
    if (false) {
      String[] info = email.split("@");
      email_id = info[0];
      email_domain = info[1];
    }
    
    // 방법2 - .indexOf(), .substring()    
    int idx = email.indexOf("@");//4
    email_id = email.substring(0,idx);//duly
    email_domain = email.substring(idx+1);
    

    String result = String.format("아이디는 %s, 도메인은 %s", email_id, email_domain);
    System.out.println(result);
    
    //문제2 - 주민등록번호에서 생년월일 추출하기
    //030121-1234567   = y2k 이후 출생한 남자 / 2003년 01월 21일 출생한 남자
    //901215-2064119   = y2k 이전 출생한 여자 / 1990년 12월 15일 출생한 여자
    
    String jumin = "0301213234567";
    String yy = jumin.substring(0,2); //03
    String mm = jumin.substring(2,4); //01
    String dd = jumin.substring(4,6); //21
   // System.out.printf("출생일은 %s년 %s월 %s일\n", "20" + yy, mm, dd);  
    
    //성별을 나타내는 데이터 떼어오기
    String gender_code = jumin.substring(6,7);
    
    //방법2
    if(gender_code.equals("1") || gender_code.equals("2")) {
      yy = "19" + yy;
    } else {
      yy = "20" + yy;
    }
    
    //y2k 이전 이후 판별 
    String y2k = "y2k 이후";
    if(Integer.parseInt(yy) < 2000) {
      y2k = "y2k 이전";
    }
    
    //성별 판별하기 
    String gender = "남자";
    
    if(gender_code.equals("2") || gender_code.equals("4")) {
      gender = "여자";
    }
    
    //출력형식에 맞춰서 출력
    String info = String.format("%s %s년 %s월 %s일 출생한 %s", y2k, yy, mm, dd, gender);
    System.out.println(info);
  }
} 
