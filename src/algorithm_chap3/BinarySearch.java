package algorithm_chap3;

import java.util.Arrays;

// 이진 검색 빠르게 구현
public class BinarySearch {
    public static void main(String args[]){
        int [] arr = {200,300,400,500,555,3354,33355,56666666};
        System.out.println(search(arr,3354));
        System.out.println(Arrays.binarySearch(arr,3354)+1);    // java의 표준 라이브러리가 제공하는 메서드 - 자동 이진검색
        System.out.println(Arrays.binarySearch(arr,666)); // 배열이 없는 경우 삽입될 위치를 음수로 return 한다. -index-1 을 리턴 프린트결과 -6


    }

    public static int search(int [] a ,int target){
        int low=0;
        int high = a.length;
        while (low < high) {
            int ruler = (low + high) / 2;
            if (a[ruler] == target) {
                return ruler + 1;
            } else if (a[ruler] < target) {
                low = ruler;
            } else {
                high = ruler;
            }
        }
        return -1;
    }

}
