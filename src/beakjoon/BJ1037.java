package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1037 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();             // 직동 오류 방지
         int arr[]=new int[number];
         String str=sc.nextLine();
         String[] arrSt;
         arrSt=str.split(" ");
         for(int i=0;i<arrSt.length ;i++) {
                arr[i] = Integer.parseInt(arrSt[i]);
         }
         Arrays.sort(arr);
         int ans =(arr[0]*arr[arr.length-1]);
         System.out.print(ans);
        }}


