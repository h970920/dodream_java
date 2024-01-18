package exception_110;

//배열의 예외발생에 대해 
public class Ex20_Array_Exception {

 public static void main(String[] args) {
  
   int[] arrNum = new int[3];
   
   
   for (int i =0; i<5; i++) {
     //if문으로 예외오류 발생 회피
     if(i<arrNum.length) {
       arrNum[i] = i;
       System.out.printf("\n arrNum[%d] = %d", i,arrNum[i]);
     }
   //i값이 3이 되는 순간 ArrayIndexOutOfBoundesException 예외오류 발생
    
   }
}
}
