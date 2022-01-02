package java_grammer_basic;

public class SearchArr {
    public static void main(String[] args) {
        int[] arr = {2, 24456, 56, 34, 56, 567, 456, 678, 434, 245, 357, 899, 457, 246};
        System.out.println(getAnswer(arr, 4343));
        System.out.println(getTarget(arr, 434));
        int [] binaryArr= {20,30,64,78,98,100,103,105,465};
        System.out.println(binarySearch(binaryArr,103));
    }

    // 선형 검색 구현 숏코딩  - O(n) 소요
    static int getAnswer(int[] arr, int target) {
        int i = 0;
        while (i != arr.length - 1) {
            if (arr[i] == target) {
                break;
            } else {
                i++;
            }
        }
        if (i == arr.length - 1) {
            System.out.print("아무것도 찾지 못했습니다.");
            return 0;
        }
        return i;
    }

    // 삼항 연산자 사용
    static int getTarget(int arr[], int target) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) break;
        }
        return arr.length == i ? -1 : i;
    }


    // Binary Search 빠르게 구현 - O(log n ) 소요
    static int binarySearch(int [] arr, int target){
        int high=arr.length-1;
        int low= 0;
        while (low < high) {
            int ruler=(low+high)/2;
            if (arr[ruler] == target) {
                return ruler;
            } else if (target > arr[ruler]) {
                low = ruler + 1;
            } else {
                high = ruler - 1;
            }
        }
        return -1 ;
    }

    static void

}
