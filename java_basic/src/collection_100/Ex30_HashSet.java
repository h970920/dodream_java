package collection_100;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex30_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> numSet = new HashSet<Integer>();

        numSet.add(100);
        numSet.add(225);
        numSet.add(3);
        numSet.add(44);
        numSet.add(55);
        numSet.add(3); // 중복값이라 무시

        numSet.remove(3);

        System.out.println("numSet에 포함된 원소의 개수는 " + numSet.size()); // 저장된 원소의 수
        System.out.println("-------------for 문으로 출력 ------------");
        for (int num : numSet) {
            System.out.printf("%d,\t", num);
        }

        System.out.println("\n-------------Stream으로 출력 ------------");
        numSet.stream().forEach(num -> System.out.printf("%d,\t", num));

        System.out.println("\n\n-------------로또 볼 추첨------------");

        // 1~45 사이에서 중복되지 않는 6개의 숫자를 HashSet 객체에 저장

        HashSet<Integer> lottoPaper = new HashSet<Integer>();

        Random random = new Random();
        while (lottoPaper.size() < 6) {
            int ballNum = random.nextInt(45) + 1;
            lottoPaper.add(ballNum);
        } // end of while
        System.out.println("----------------for문으로 출력-----------");
        for(int num : lottoPaper) {
          System.out.printf("%d \t" , num);
        }
        // 로또번호 출력 using Stream
        System.out.println("\n-------------Stream으로 출력 ------------");
        lottoPaper.stream().forEach(num -> System.out.printf("%d \t", num));
    }
}
