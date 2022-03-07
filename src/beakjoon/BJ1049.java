package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

// 기타줄 문제 실4
public class BJ1049 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int needs=sc.nextInt();
        int company=sc.nextInt();

        int[] set=new int[company];
        int[] one=new int[company];

        for(int j=0;j<company;j++){
            set[j]=sc.nextInt();
            one[j]=sc.nextInt();
        }
        Arrays.sort(set);
        Arrays.sort(one);
        if(set[0]==0){
            System.out.print(needs*one[0]);
        } else{
            System.out.print(set[0]*(needs/6)+getMax(set,one,needs%6));
        }
    }
    public static int getMax(int [] x,int [] y,int r){
        if(x[0]<y[0]*r){
            return x[0];
        } else return y[0]*r;
    }

}
