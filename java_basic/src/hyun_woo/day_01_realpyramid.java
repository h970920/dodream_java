package hyun_woo;

/*
 * 진짜 피라미드 만들기 
 *
 *    *
 *   ***
 *  *****
 * *******
 */
public class day_01_realpyramid {
public static void main(String[] args) {
  
  for ( int a = 6; a > 1; a--)
  {
    for ( int b = 1; b < a; b++)
    {
      System.out.print(" ");
    }
      for ( int c = 7 ; c > a ; c--)
      {
        System.out.print("x");
      }
          for ( int d= 6; d > a; d--)
          {
            System.out.print("x");
          }
          System.out.println();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  
  
  
  
  
  
  
  
  
  
}
