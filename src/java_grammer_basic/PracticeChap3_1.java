package java_grammer_basic;

import java.util.Scanner;

// 1000까지 소수 구하기 코드
public class PracticeChap3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
//        getPrimeNumber(number);
        getPrimeNumberAnother(number);
    }
    // 약수가 총 두개밖에 없다는 발상 , 3분 소요
    static void getPrimeNumber(int range){
        for(int i=1; i<=range;i++) {
            int cnt=0;
            for (int j = 1; i >= j; j++) {
                if (i % j == 0) {
                    cnt += 1;
                }
            }
            if (cnt == 2) {
                System.out.printf("%d 사이의 소수인 %d %n", range, i);
            }
        }
    }

    // 1과 자신을 제외한 수 중에 약수가 존재하지 않으면 소수라는 발상
    static void getPrimeNumberAnother(int range){
        for (int i = 2; i <= range; i++) {
            int j;
            for (j = 2; j<i ; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            // 끝까지 돌았으면 출력 ( 끝까지 돌기 전에 break 된 것- 약수가 있는 수들은 j와 i가 달라서 출력 못함 )
            if(j==i) System.out.printf("%d 사이의 소수인 %d %n", range, i);
            }
        }
    }





