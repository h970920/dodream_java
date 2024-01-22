package collection_100;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;

//HashMap은 자바스크립트의 Object와 유사하다.

public class Ex40_HashMap {
  
  public static void main(String[] args) {
    
  HashMap<String, String> memMap = new HashMap<String, String>();
  
  System.out.println("현재 memMap 객체가 비어 있나요?" + memMap.isEmpty());
  
  memMap.put("duly", "둘리");
  memMap.put("hani", "하니");
  memMap.put("micol", "마이콜");
  memMap.put("IU", "아이유");
  
  memMap.put("hani", "달려라하니"); // 재정의가능(수정)
  
  System.out.println(memMap.get("duly"));
  System.out.println(memMap.get("hani"));
  System.out.println(memMap.get("micol"));
  System.out.println(memMap.get("IU"));
  
  memMap.remove("duly");
  System.out.println();
  System.out.println("memMap 객체의 담긴 원소의 개수는? " + memMap.size());
  
  System.out.println("--------------");
  System.out.println("hani라는 이름의 key가 있나요? " + memMap.containsKey("hani"));
  System.out.println("--------------");
  System.out.println("아이유라는 이름의 값이 있나요?" + memMap.containsValue("아이유"));
  
  System.out.println();
  System.out.println("memMap의 KEY만 가져와서 출력하기");
  Set<String> idSet = memMap.keySet();
  for(String id : idSet) {
    System.out.println(id+ " : " + memMap.get(id));
    

    System.out.println();
  
  }
  //스트림으로 출력시도 
  System.out.println("-----------스트림으로 출력시도 --------------");
  Stream<String> idStream = idSet.stream();
  idStream.forEach(id->System.out.println(id+ " : " + memMap.get(id)));
  
  System.out.println();
  System.out.println("5. memMap의 value만 가져와서 출력하기");
  Collection<String> collection = memMap.values();
  collection.stream().forEach(val->System.out.println(val));
  
  }
}