package algorithm_chap3;

import java.util.Arrays;
import java.util.Comparator;

public class Id {
    private static int counter=0; // 클래스 변수
    private String[] information={"abc","bcd","string","research","zookeeper"};   // 인스턴스 변수
    private int age;
    public Id(int age){
        counter++; // 생성자
        this.age=age;
    }
    // 클래스 메서드
    public static int getCounter(){
        return counter;
    }
    // 인스턴스 메서드
    public String[] getInformation(){
        return information;
    }

    public static final Comparator<Id> COMPARATOR=new Comp();

    static class idTest {
        public static void main(String[] args) {
            Id[] id = {
                    new Id(12),
                    new Id(23),
                    new Id(33),
                    new Id(2),
                    new Id(1)
            };
            System.out.println(Arrays.binarySearch(id[0].getInformation(), "bcd")); // String 에서도 key값으로 인덱스 위치 찾을 수 있다.
            System.out.println(Id.getCounter());
            System.out.println(Arrays.binarySearch(id,new Id(1), COMPARATOR)); // 내림차순 정렬했기때문에
        }
    }
    // 내림차순 정렬 - Comparator 구현
    private static class Comp implements Comparator<Id>{
        @Override
        public int compare(Id d1, Id d2) {
            if(d1.age<d2.age){
                return 1;
            } else if(d1.age>d2.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
