package beakjoon;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class BJ1015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int buffer=sc.nextInt();
        sc.nextLine();             // 직동 오류 방지
        int arr[]=new int [buffer];
        String str=sc.nextLine();
        String[] arrSt=new String[buffer];
        arrSt=str.split(" ");
        int[] ans=new int[buffer];
        for(int i=0;i<arrSt.length ;i++){
            arr[i]=Integer.parseInt(arrSt[i]);
            ans[i]=Integer.parseInt(arrSt[i]);
        }
        
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++) {
            for (int k = 0; k <arr.length;k++) {
                if (ans[k]== arr[j]) {
                    ans[k]=j;
                    break;
                }
            }}
        for (int an : ans) {
                System.out.printf("%d ", an);
            }
        }}


