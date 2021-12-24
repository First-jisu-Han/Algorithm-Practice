package java_grammer_basic;

import java.util.Scanner;

// 1000까지 소수 구하기 코드
public class PracticeChap3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        getPrimeNumber(number);
    }
    // 약수가 총 두개밖에 없다는 발상 , 3분 소요
    static void getPrimeNumber(int range){
        for(int i=1; i<=range;i++) {
            int cnt=0;
            for (int j = 1; i >= j; j++) {
                if (i % j == 0) {
                    cnt+= 1;
                }
            }
            if (cnt==2) {
                System.out.printf("%d 사이의 소수인 %d %n", range, i);
            }
        }
            }

        }


