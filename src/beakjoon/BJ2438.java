package beakjoon;

import java.util.Scanner;
// 백준 브3 간단한 별출력 - 문풀: 2분 소요
public class BJ2438{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}