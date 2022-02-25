package algorithm_chap6;

// 버블 정렬
public class BubbleSort {
    public static void main(String[] args) {
        int intArr[] = {100, 90, 200, 500, 110, 20, 3, 5, 7, 1};
//        bubbleSort(intArr);
//        for (int arr : intArr) {
//            System.out.print(arr + " ");
//        }
        bubbleSortingVisualization(intArr);
    }

    public static void bubbleSort(int[] intArr) {
        for (int i = intArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    swap(intArr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSortingVisualization(int[] intArr) {
        for (int i = intArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(intArr[k] + " ");
                }
                if (intArr[j] > intArr[j + 1]) {
                    swap(intArr, j, j + 1);
                    System.out.print(intArr[j]+"+");
                }
                else{
                    System.out.print(intArr[j]+"-");
                }
                for(int m=j+1;m<intArr.length;m++){
                    System.out.print(intArr[m]+" ");
                }
                System.out.println();

            }
        }
    }
}


