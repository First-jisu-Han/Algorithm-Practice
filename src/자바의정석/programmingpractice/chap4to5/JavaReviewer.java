package 자바의정석.programmingpractice.chap4to5;


/* 자바의 정석 복습 136page - 220page  0630 chapter4, chapter5  */


import java.util.Arrays;
import java.util.Scanner;


public class JavaReviewer{
    public static void main(String[] args) {
        // 중첨 if 구문
        Scanner sc=new Scanner(System.in);
        int score =sc.nextInt();
        char opt =' ';
        if(score>90) {
            System.out.print("A");
            if (score >= 98) {
                opt = '+';
            } else if (score >= 95) {
                opt = '-';
            }
            System.out.println(opt);
        } else System.out.println("90이하점");
        String grade=sc.next();
        // 경우의 수 - switch - case , ENUM
        switch(grade) {
            case "VIP": case "vip":
                System.out.println("VIP 의 특권");
            case "GOLD": case "gold":
                System.out.println("GOLD 의 특권");
            case "BASIC": case "basic":
                System.out.println("BASIC 회원의 서비스");
                break;
            default :
                System.out.println("회원가입부터 하세요");
        }
        // 별출력 거꾸로~
        for(int i=1;i<=10;i++){
            for(int j=10;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        // 계단식 구현
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==i){
                    System.out.printf("[%d,%d]",i,j);
                } else System.out.printf("%5s"," ");
            }
            System.out.println();
        }
        // 배열 다루기
        String [] st={"a","b","c","d","e","f","g"};
        System.out.println(Arrays.toString(st));  // 배열 전체 출력
                                                  // [a,b,c,d,e,f,g]
        // 배열 길이 늘리기
        int stLength=st.length;
        String [] temp = new String[stLength*2];  // 자료구조에서 많이 이용--> 배열내용 옮긴것 가비지 컬렉터가 처리
        // 배열의 복사
//        System.arraycopy(st,0,temp,0,st.length); // st[0]의 값을 temp[0]값부터 옮기는데, st.length 길이만큼 옮긴다.
        System.arraycopy(st,0,temp,5,st.length); // st[0]의 값을 temp[5]값부터 st.length 길이만큼 옮긴다.
//       null null null null null a b c d e f g null null


        for(String element:temp){
            System.out.printf("%s ",element);
        }
        //       null null null null null a b c d e f g null null
        System.out.print("\n");
        System.out.println(temp.length); // 14

        // 배열 가지고 놀기 max, min
        int [] intArr= new int[]{20,30,40,90,10,22,34,95,99,100,200,338};
        int max=0;
        for(int i =0; i<intArr.length;i++){
            if(max<intArr[i]){
                max=intArr[i];
            }
        }
        System.out.println(max); //338
        // 카드 섞기 shuffle
        int range =(int)(intArr.length*Math.random());
        for(int i=0; i<intArr.length; i++){
            int tp=intArr[i];
            intArr[i] = intArr[range];
            intArr[range]=tp;
        }
        for(int element:intArr){
            System.out.println("------------------");
            System.out.println(element);
        }

        // 배열 갖고 놀기 버블 정렬 알고리즘
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 1; j < intArr.length-i; j++) {
                if (intArr[j] <= intArr[j - 1]) {
                    int tmp = intArr[j -1];
                    intArr[j - 1] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        for(int element:intArr){
            System.out.print(element+" ");
        }








    }



}
