package beakjoon;


import java.util.Scanner;

public class BJ2588 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int k=num2;
        while(k>0){
            System.out.println(num1*(k%10));
            k=k/10;
        }

        System.out.print(num1*num2);
    }
}