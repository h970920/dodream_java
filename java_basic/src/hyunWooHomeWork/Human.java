package hyunWooHomeWork;

public class Human {
    String name;
    int age, arm;
    public Human() {}
    public Human(String name1,int age1,int arm1) {
      name=name1;
      age=age1;
      arm=arm1;
    }
    public Human(String name1,int age1) {
      name=name1;
      age=age1;
      arm=1;
    }
    public void printH() {
      System.out.println("이름 : "+ name + "나이 :"+ age +  "팔개수 : "+arm);
    }
}
