package hyun_woo;

import java.util.Iterator;
import java.util.Scanner;

public class BubleSort {
  public static void priFn(int[] num) {
    for(int i= 0 ; i<num.length; i++) {
      System.out.println(i + "번쨰 변수에는 " + num[i] );
    }
  }
  
  public static void BubleSortdown(int[]number) {
  System.out.println("--------정렬을 시작합니다 ---------");
    for(int i=0; i<number.length; i++) {
      for(int j=0; j<number.length-1-i;j++) {
        if(number[j]<number[j+1]) {
          int max = number[j];
          number[j] = number[j+1];
          number[j+1] = max;
        }
      }
    }
  System.out.println("--------정렬을 완료했습니다.---------");
  }
  
   public static void BubleSortup(int[]number) {
     System.out.println("--------정렬을 시작합니다 ---------");
     for(int i=0; i<number.length; i++) {
       for(int j=0; j<number.length-1-i;j++) {
         if(number[j]>number[j+1]) {
           int min = number[j];
           number[j] = number[j+1];
           number[j+1] = min;
        
         }
       }
     }
     System.out.println("--------정렬을 완료했습니다.---------");
   }
   
   public static int[] BubleSortdelete(int[]number,int userchoice) {
     
     int num2[] = new int[number.length-1];
    
    for(int i = userchoice ; i < number.length-1 ; i++) {
      
      number[i] = number[i+1];  
    
    }
    
    for(int i = 0 ; i <num2.length; i++) {
      
      num2[i] = number[i];
    }
     
     return num2; 
  }
  
   public static int[] BubleSortadd(int[]number) {
     
     Scanner scanner = new Scanner(System.in);

     System.out.println("어떤 배열을 추가하시겠습니까? ");
     int userinput = scanner.nextInt();

     int num3[] = new int[number.length + 1];

     for (int i = 0; i < userinput; i++) {
         num3[i] = number[i];
     }

     System.out.println("추가하고 싶은 값을 입력하세요: ");
     int num4 = scanner.nextInt();

     num3[userinput] = num4;

     for (int i = userinput+1 ; i < num3.length; i++) {
         num3[i] = number[i-1];
     }

     return num3;
 
   
   }//end of BSadd

  public static void main(String[] args) {
    int number[] = new int[] {
        32,42,23,1,23,43,32,34,5,535
    };
    Scanner s = new Scanner(System.in);
    while(true) {
      System.out.println("1.입력된 배열 보기  2.배열 정렬하기  3.배열 삭제하기  4.배열 추가하기");
      int num = s.nextInt();
      
      switch (num) {
    case 1: {
      priFn(number);
      break;
    }
    case 2: {
      System.out.println("1. 내림차순정렬 2. 오름차순 정렬 ");
      int num2 = s.nextInt();
      if(num ==1 )
        BubleSortdown(number);
      else
        BubleSortup(number);
      break;
    }
    case 3: {
      System.out.println("몇번째 변수를 삭제하시겠습니까 ? ");
      int num3 = s.nextInt();
      number = BubleSortdelete( number ,num3);
      break;
    }
    case 4: {
      number = BubleSortadd(number);
      break;
      
    }
    default:
      
    }

    } 
  }
}
  
      
