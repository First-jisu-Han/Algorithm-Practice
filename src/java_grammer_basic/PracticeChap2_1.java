package java_grammer_basic;

import java.util.Scanner;

public class PracticeChap2_1 {
    public static void main(String[] args) {
        System.out.println(cardConvert(128,2,new char[30]));
        cardConverting();
    }
    //기수 변환
    static int cardConvert(int x, int y, char [] a) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do {
            a[digits++] = dchar.charAt(x % y);     // 후위 증감자 사용
            x /= y;
        } while (x != 0);
        return digits;                             // 몇자리수인지 return
    }
    // 기수 변환 프로그램
    static void cardConverting(){
        Scanner sc=new Scanner(System.in);
        System.out.print("입력 값: ");
        int num=sc.nextInt();
        System.out.print("바꿀 진법: ");
        int notation=sc.nextInt();
        char [] a=new char[100];
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i=0;
        System.out.printf(" %d |     %d      %n",notation,num);
        while(num!=0){
            a[i]=dchar.charAt(num%notation);
            System.out.printf("    _______________%n");
            num/=notation;
            System.out.printf(" %d |     %d ------     %c%n",notation,num,a[i]);
            i++;
        }
    }



}
