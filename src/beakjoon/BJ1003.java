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
        for(int j=0;j<num.length;j++){
        fibo(num[j]);
        }
    }

    public static void fibo(int n){
        int[][] f =new int[41][2];   // 최대 40개가능
        f[0][0]=1;
        f[0][1]=0;
        f[1][0]=0;
        f[1][1]=1;
        for(int i=2;i<41;i++){
            f[i][0]=f[i-1][0]+f[i-2][0];
            f[i][1]=f[i-1][1]+f[i-2][1];
        }
        System.out.printf("%d ",f[n][0]);
        System.out.println(f[n][1]);
    }


}
