package beakjoon;

import java.util.Scanner;

public class BJ1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buffer = sc.nextInt();
        sc.nextLine();             // 직동 오류 방지
        int[] arr = new int[buffer * 2];
        String[] arrStr = new String[buffer * 2];
        for (int i = 0; i < buffer; i++) {
            String str = sc.nextLine();
            arrStr = str.split(" ");
            arr[i] = Integer.parseInt(arrStr[0]);
            arr[i + 1] = Integer.parseInt(arrStr[1]);
        }
        double[] ans=new double[buffer];
        for(int j=0;j<buffer*2;j+=2) {
            double num=Math.pow(arr[j], arr[j + 1]);
            while(num>=10){
                num/=10;
            }
            ans[j]=num%10;
        }
        for(double an:ans){
            System.out.println(an);
        }

    }}
