package collection_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
  스트림이란?
  
  1. 배열, 컬렉션을 대상으로 일관성 있는 자료 처리 연산을 수행
  2. 스트림 연산은 기존 자료를 변경하지 않음 (불변)
  
  3. 스트림 연산은 중간 연산과 최종 연산으로 구분
  4. 중간 연산은 여러 개의 연산이 적용될 수 있지만, 최종 연산은 마지막에 한 번만 적용됨
  5. 최종 연산이 호출되어야 중간 연산에 대한 수행이 이루어지고 그 결과가 만들어진다.
  6. 따라서 중간 연산에 대한 결과를 연산 중에는 알 수 없다.
  
  7. 한 번 생성하고 사용한 스트림은 재사용할 수 없음
  8. 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
  9. 다른 연산을 수행하기 위해서는 스트림을 다시 생성해야 한다
  
  [중간 연산, 최종 연산]
  1. 중간 연산의 예 - .filter(), .map(), .sorted() 등
  2. 조건에 맞는 요소를 추출(filter)하거나 요소에 공통적인 작업을 하여 변환된 결과를 리턴(map)
  
  3. 최종 연산의 예 - .forEach(), count(), sum() 등
*/
public class Ex50_CollectionStream {
  public static void main(String[] args) {
    // 1,2,3,4,5를 원소로 하는 정수 배열 arrNum을 선언하시오
    int[] arrNum = new int[]{1, 2, 3, 4, 5};
    
    // 1. 어드밴스드 for문을 이용하여 콘솔창에 출력하시오
    for (int num : arrNum) {
      System.out.println(num);
    }
    
    // 2. arrNum 배열에서 뽑아낸 스트림 매체 numStream을 이용하여 제곱한 후 그 값 중 9 이상인 수를 출력하시오.
    if (false) {
      IntStream numStream = Arrays.stream(arrNum);
      numStream.map(num -> num * num)
               .filter(num -> num >= 9)
               .forEach(num -> System.out.println(num));
    }
  
    // 3. arrNum 배열 원소의 개수를 출력하시오 -> 5
    if (true) {
      IntStream numStream = Arrays.stream(arrNum);
      System.out.printf("arrNum 배열 원소의 개수는 %d\n\n", numStream.count());
    }
    
    // 4. arrNum 배열 원소의 합을 출력하시오 -> 15
    System.out.printf("arrNum 배열 원소의 합은 %d\n", Arrays.stream(arrNum).sum());
    
    // 5. 리스트 컬렉션에 여러 개의 People 객체를 저장하시오.
    List<People> peopleList = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
      People people = new People("익명_", "010-1234-5678" + i);
      peopleList.add(people);
    }
    
    System.out.println("\n\npeopleList의 크기는 " + peopleList.size());
    
    // 6. peopleList에 저장된 데이터를 출력하시오 
    for (People p : peopleList) {
      System.out.println(p.toString());
    }
    
    peopleList.clear(); // 초기화
    System.out.println();
    
    // 5-1 
    IntStream.range(0, 10).forEach(num -> System.out.println(num));
    
    // 6-1
    peopleList.forEach(p -> System.out.println(p.toString()));
    
    peopleList.clear(); // 초기화
    System.out.println();
    
    // 5, 6 과정을 통합
    IntStream.range(0, 10)
             .mapToObj((i) -> new People("익명_", "010-1234-5678" + i))
             .collect(Collectors.toList())
             .forEach(people -> System.out.println(people.toString()));
  } // end of main
}
