package java_grammer_basic;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

// 1000까지 소수 구하기 코드
public class PracticeChap3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
//        getPrimeNumber(number);
//        getPrimeNumberAnother(number);
        getPrimeNumberOpt(number);
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

    // 1과 자신을 제외한 수 중에 약수가 존재하지 않으면 소수라는 발상 - 알고리즘 효율화
    static void getPrimeNumberAnother(int range) {
        for (int i = 2; i <= range; i++) {
            int j; // for 문안에 넣지 않고 뺀것은 지역변수 이슈가 있어서 인듯함
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            // 끝까지 돌았으면 출력 ( 끝까지 돌기 전에 break 된 것- 약수가 있는 수들은 j와 i가 달라서 출력 못함 )
            if (j == i) System.out.printf("%d 사이의 소수인 %d %n", range, i);
        }
    }

    // 소수 구하는 코드 알고리즘 효율화 - 알고리즘
    static void getPrimeNumberOpt(int range) {
        int[] prime = new int[range];
        int primeNum = 0;   // prime 안에 저장된 개수
        prime[primeNum++] = 2;
        for (int i = 3; i <= range; i+=2) {
            int j;
            for (j = 1; j<primeNum; j++) {
                if (i % prime[j] == 0)
                    break;
            }
            if (j == primeNum ) {
                prime[primeNum++] = i;
            }
        }
        for(int n=0;n<primeNum;n++ ){
            System.out.printf("입력한 곳까지의 %d 번째 소수 : %d %n",n+1,prime[n]);
        }
    }


}







