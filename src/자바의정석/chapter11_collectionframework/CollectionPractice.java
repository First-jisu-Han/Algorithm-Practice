package 자바의정석.chapter11_collectionframework;

import java.util.ArrayList;
import java.util.Collections;

//ArrayList -기존의 Vector를 개선한 것
public class CollectionPractice {
    public static void main(String[] args) {

        ArrayList al= new ArrayList(10);
        al.add(new Integer(5));
        al.add(new Integer(4));
        al.add(new Integer(0));
        al.add(new Integer(4));

        ArrayList al2 = new ArrayList(al.subList(0,4)); // 0~3인덱스까지 잘라서 ArrayList에 새로 삽입
        System.out.println("al = " + al);
        System.out.println("al2 = " + al2);
        //al = [5, 4, 0, 4]
        //al2 = [5, 4, 0, 4]

        Collections.sort(al);
        Collections.sort(al2);
        System.out.println("al = " + al);
        System.out.println("al2 = " + al2);

        // al = [0, 4, 4, 5]
        // al2 = [0, 4, 4, 5]
        al.add(2,"AA"); // 기존 인덱스 값들을 밀어냄
        al.add(1, "BB");
        al.add(2,"CC");

        System.out.println("al = "+al);
        // al = [0, BB, CC, 4, AA, 4, 5]

        // al2와 겹치는 부분만 al에서 남겨둔다.(교집합 느낌)
        al.retainAll(al2);
        System.out.println("al2 = " + al2);
        // al2 = [0, 4, 4, 5]


        // 겹치는 부분 제외하기 (차집합 느낌)
        for(int i=al2.size()-1;i>=0;i--){
            if(al.contains(al2.get(i))){
                al2.remove(i); // 해당 인덱스 삭제
            }
        }
        System.out.println("al2 = " + al2);
        // al2 = []
// python 공부중 리스트에서 동작하는게 자바에서 동작하는지 간단한 테스트
        int[] arrs= {3,4,5};
        int [] oarr=  arrs;
        arrs[1]=2;
        for(int arr: oarr){
            System.out.println("oarr = " + oarr);
        }
    }


}
