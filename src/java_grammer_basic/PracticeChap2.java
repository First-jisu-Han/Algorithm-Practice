package java_grammer_basic;
// java 자료구조 + 알고리즘 기술면접구현 + 알고리즘 (책)  chapter 2/11

import java.util.Scanner;
import java.util.Random;
public class PracticeChap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int k =rand.nextInt(90);
        // k는 0~89까지의 수가 가능함. 90으로 나눈나머지라고 생각하면됨.

        int a[] = new int[8];
        a[0] = 123;
        a[1] = 23;
        a[2] = 57;
        a[3] = 567;
        a[4] = 2;
        a[5] = 2953;
        a[6] = 1234;
        a[7] = 949;
        int b[] = {565, 4435, 3244, 32456, 2345, 2, 14, 56, 677, 89};
        System.out.println(getMax(a));
        System.out.println(getMax(b));
        System.out.println("b 배열 뒤집기");
        for(int j:b){
            System.out.print(j+" ");
        }
        System.out.println();
        reverseArr(b);

        for(int j:b){
            System.out.print(j+" ");
        }
        System.out.println();
        commentAboutOctalHexadecimal();

    }
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    static void reverseArr(int[] arr){
        for(int i=0;i<arr.length/2;i++) {
            swap(arr,i,arr.length-i-1);
        }
    }
    static void swap(int arr[],int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
   static void commentAboutOctalHexadecimal(){
       System.out.println("Ox 시작은 Hexadecimal 16진수");
       System.out.println("0 시작은 Octal 8진수 ");
       System.out.println("나머지는 10진수 취급");
   }





    }




