package beakjoon;

import java.util.Scanner;

public class BJ1003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cnt=sc.nextInt();
        int i=0;
        int num[]=new int[test_cnt];
        while(test_cnt!=0) {
            int number = sc.nextInt();
            num[i] = number;
            i++;
            test_cnt--;
        }
    }

    public static Integer[] fibo(int n){
        if(n==0){
            cnt1++;
            return 0;
        }
        else if(n==1){
            cnt2++;
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }


}
