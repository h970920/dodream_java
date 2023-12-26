package class_50;
class human {
  
    String name;
    int age;
  

}
public class main {

  public static void main(String[] args) {
        
        human hong = new human();
        hong.name = "홍길동";
        hong.age = 9;
        System.out.println("첫번째 사람의 이름은 " + hong.name + " 나이는 " + hong.age );
        
        human sung = new human();
        sung.name = "또치";
        sung.age = 10;
        System.out.println("두번째 사람의 이름은 " + sung.name + " 나이는 " + sung.age );
        
        human won = new human();
        won.name = "둘리";
        won.age = 8;
        System.out.println("세번째 사람의 이름은 " + won.name + " 나이는 " + won.age );
        
   
    
      
    }
}
