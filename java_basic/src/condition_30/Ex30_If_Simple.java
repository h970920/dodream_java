package condition_30;

public class Ex30_If_Simple {

  public static void main(String[] args) {
    
    boolean isKorean = true;
    
    if(isKorean) {
      System.out.println("한국 사람 입니다.");
    }
    if(isKorean==false) {
    System.out.println("한국 사람이 아닙니다.");
    }
    if(!isKorean) {
    System.out.println("한국 사람이 아닙니다.");
    }
    
    
    boolean isJapanese = false; 
    
    if(isJapanese) {
      System.out.println("일본인이 아닙니다");
    }
    if(!isJapanese) {
      System.out.println("일본인 입니다");
    }
    
    
    
  }
}
