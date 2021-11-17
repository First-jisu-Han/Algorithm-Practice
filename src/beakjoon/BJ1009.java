package beakjoon;

import java.util.Scanner;

public class BJ1009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int buffer=sc.nextInt();
        sc.nextLine();             // 직동 오류 방지
        double [] ans=new double[buffer];
        for(int i=0;i<buffer;i++){
            String str=sc.nextLine();
            int arr[]=new int [2];
            String[] arrSt;
            arrSt=str.split(" ");
            for(int j=0;j<2 ;j++){
                arr[j]=Integer.parseInt(arrSt[j]);
            }
            int k=(int)Math.pow(arr[0],arr[1]);
            ans[i]=k%10;
        }
        for(double an:ans){
            System.out.println(an);
        }




    }}