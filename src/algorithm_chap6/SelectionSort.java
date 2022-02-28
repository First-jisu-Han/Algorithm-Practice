package algorithm_chap6;

// 선택 정렬 알고리즘
public class SelectionSort {
    public static void main(String[] args) {
        int intArr[] = {100, 90, 200, 500, 110, 20, 3, 5, 7, 1};
        selectionSorting(intArr);
        for(int arr:intArr){
            System.out.print(arr+" ");
        }
    }

    public static void selectionSorting(int[] intArr){
        for(int i=0;i<intArr.length-1;i++){
            int min=i;
            for(int j=i+1;j<intArr.length;j++){
                if(intArr[j]<intArr[min]){
                    min=j;
                }}
            int temp=intArr[i];

            intArr[i]=intArr[min];
            intArr[min]=temp;
        }
    }
}