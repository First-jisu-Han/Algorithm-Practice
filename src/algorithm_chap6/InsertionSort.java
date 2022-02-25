package algorithm_chap6;

public class InsertionSort {
    public static void main(String[] args) {
        int intArr[] = {100, 90, 200, 500, 110, 20, 3, 5, 7, 1};
        insertionSorting(intArr);
        for(int arr:intArr){
            System.out.print(arr+" ");
        }

    }
    public static void insertionSorting(int [] intArr){
        for(int i=1;i<intArr.length;i++){
            int temp=intArr[i];
            int j;
            for(j=i; j>0 && intArr[j-1]>temp;j--){
                intArr[j]=intArr[j-1];
            }
            intArr[j]=temp;
        }
    }

}
