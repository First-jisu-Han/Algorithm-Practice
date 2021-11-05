package dp_practice;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(recurfibo(7));
        System.out.println(iterfibo(7));
    }

    // 재귀 피보나치 수열
    public static int recurfibo(int n){
        if(n==1 || n==2) return 1;
        return recurfibo(n-1)+recurfibo(n-2);
    }

    // 반복문 피보나치 수열
    public static int iterfibo(int n){
        int[] numArr=new int[n+1];
        numArr[0]=0;
        numArr[1]=1;
        numArr[2]=1;
        for(int i=3;i<=n;i++){
            numArr[i]=numArr[i-1]+numArr[i-2];
        }
        return numArr[n];


    }


}
