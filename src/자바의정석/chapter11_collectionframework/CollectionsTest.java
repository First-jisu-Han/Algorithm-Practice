package 자바의정석.chapter11_collectionframework;

import java.lang.reflect.Array;
import java.util.*;

// Collection FrameWork 스터디
public class CollectionsTest {
    public static void main(String[] args) {

        Map<String,String> mapper= new HashMap<>();
        mapper.put("map1","One");
        mapper.put("map2","Two");
        mapper.put("map3","Three");
        mapper.put("map4","Four");

        System.out.println(mapper.get("map3"));
        System.out.println(mapper.get("map4"));

        System.out.println(mapper.size());

        String [] arr= new String[mapper.size()];

        // Key 또는 Value와 일치하는 값이 존재하는지에 대한 여부
        System.out.println(mapper.containsKey("map3"));
        System.out.println(mapper.containsValue("Two"));

        // Value 들은 중복이 될 수 있기때문에 반환타입 Collection
        System.out.println(mapper.values());

        // key 들은 중복안되기 때문에 반환타입 Set
        System.out.println(mapper.keySet());

        List<String>list= new ArrayList<>(mapper.values());
        List<String> list1= new ArrayList(mapper.values());

        ArrayList al = new ArrayList() ; // 디폴트 크기 : 10
        ArrayList arrayList= new ArrayList(20);
        arrayList.add(0,20); // index 2의 위치에 20을 넣는다.
        arrayList.add(10);  // ArrayList의 마지막에 객체를 추가
        arrayList.add(0,21); // 기존 0에 있던 것이 밀려남
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        // toArray() - ArrayList를 객체 배열로 반환
        Object [] k=arrayList.toArray();
        for(Object minik : k){
            System.out.println("minik = " + minik);
        }
        /* 출력 결과
Three
Four
4
true
true
[Three, Two, One, Four]
[map3, map2, map1, map4]
21
20
10
         */
        arrayList.clear();




    }


}
