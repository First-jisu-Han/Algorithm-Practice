package 자바의정석.chapter6_oop1;


// 기본형 매개변수 , 참조형 매개변수
public class ReferencePractice {
    public static void main(String[] args) {
        int[] arr= {100,34,334,532,22,1,574,678};
        System.out.println(sumArr(arr));
        System.out.println();
        ascSort(arr);
        for(int a:arr){
            System.out.println("a = " + a);
        }
    }
    // 배열 합
    static int sumArr(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
// 오름 차순 정렬
    static void ascSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
    }
}
