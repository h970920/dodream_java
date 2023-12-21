package hyun_woo;
/*
 * 현우가 내준 숙제 해보기
 */


public class day_01_homework {

public static void main(String[] args) {
   
  
   for ( int i=1; i<=5; i++) {
     for( int b=4; b>=i; b--) {
       System.out.print("x");
     }  for (int s=1; s<=i; s++ ) {
       System.out.print("o");
     }    for (int m=2; m<=i; m++) {
       System.out.print("o");
     }
         System.out.println();
   }
   for( int i=1; i<=5; i++) {
     for(int b=1; b<=i; b++) {
       System.out.print("x");
     }
       for(int c=0; c<7-i; c++) {
         System.out.print("o");
       }
         for (int x=2; x>=i+1; x--) {
           System.out.print("o");
         }
         System.out.println();
         }
           
   }
  
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
}
