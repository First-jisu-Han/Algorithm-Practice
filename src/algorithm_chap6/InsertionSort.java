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
        for(int i=0;i<intArr.length;i++){
            for(int j =0; j<i;j++){
                if(intArr[i]<intArr[j]){
                    int temp=intArr[j];
                    intArr[j]=intArr[i];
                    intArr[i]=temp;
                }
            }
        }
    }

}
