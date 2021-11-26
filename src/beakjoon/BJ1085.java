package beakjoon;

import java.util.Scanner;

public class BJ1085 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] inputArr=new int[4];
        String input=sc.nextLine();
        String [] inputSt=input.split(" ");
        for(int i=0;i<inputArr.length;i++){
            inputArr[i]=Integer.parseInt(inputSt[i]);
        }
        System.out.print(isLarge(inputArr[0],inputArr[1],inputArr[2],inputArr[3]));

    }
    public static int isLarge(int x, int y, int z , int k ){
      int case1=Math.min(x,y);
      int case2=Math.min(z-x,k-y);
      int ans=Math.min(case1,case2);
      return ans;

    }
}
