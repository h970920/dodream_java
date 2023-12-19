package loop_40;

// for 반복문 : 1~100 까지의 합 - > 5050
public class Ex10_For {

  public static void main(String[] args) {
    /*
       1~10까지의 합 
      
        -> 1+2+3+4+5+6+7+8+9+10 
        
        -> 0+1
        -> (0+1)+2
        -> ((0+1)+2)+3
        -> (((0+1)+2)+3)+4
     */
    
    int sum = 0;
    
    for (int i=0; i <7; i++ ) {
      sum = sum + i ;
      
      System.out.println("sum = " + sum);
      
    }
  }
}
