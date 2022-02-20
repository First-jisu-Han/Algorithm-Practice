package algorithm_chap5;

import java.util.Scanner;

import static algorithm_chap5.recursive.fibo;
import static algorithm_chap5.recursive.iterFibonacci;

public class RecursiveAnal {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("정수 입력: " );
//        int x = sc.nextInt();
//        recursive.recur(x);
        System.out.println(fibo(6));
        System.out.println(recursive.iterFibo(6));
        System.out.println(iterFibonacci(6));
    }
}

class recursive{
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else return fibo(n -1)+fibo(n-2);
    }
    // dynamic programming
    static int iterFibo(int n){
        int[] dpInt= new int[n+1];
        dpInt[0]=0;
        dpInt[1]=1;
        if(n==0){
            return dpInt[0]=0;
        }
        else if(n==1){
            return dpInt[1]=1;
        }
        else{
            for(int i=2; i<=n; i++){
                dpInt[i]=dpInt[i-1]+dpInt[i-2];
            }
            return dpInt[n];
        }
    }
    static int iterFibonacci(int n){
        if(n==0 || n==1) return n;
        else{
            int last=1;
            int temp=0;
            int nextLast=0;
            for(int i=2;i<n+1;i++){
                temp=last+nextLast;
                nextLast=last;
                last=temp;
            }
            return temp;
        }
    }



}
