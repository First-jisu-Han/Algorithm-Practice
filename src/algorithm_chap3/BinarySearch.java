package algorithm_chap3;

// 이진 검색 빠르게 구현
public class BinarySearch {
    public static void main(String args[]){
        int [] arr = {200,300,400,500,555,3354,33355,56666666};
        System.out.println(search(arr,3354));
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
