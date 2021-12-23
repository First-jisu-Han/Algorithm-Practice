package java_grammer_basic;
import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class PracticeChap3 {
    public static void main(String[] args){
        // url 정리 관련 : %20s 앞에서 20글자 공백, %-20s 뒤에서 20글자 공백
        String url="www.google.com";
        System.out.printf("url 관리 우측 정렬 - %20s %n",url);
        System.out.printf("url 관리 좌측 정렬 - %-20s %n", url);
        // url에서 일부만 끌어내기 앞에서부터 10글자만 추출 %.10s
        System.out.printf("url 관리 www.google 만 추출하기 - %.10s  %n",url) ;
        unicodeExchange('C'); // C
        char ch=67;    // 유니코드로 저장가능
        System.out.println(ch);  // C

//       'A' 를 인코딩 -> 65   65를 디코딩 'A'
//       'a' 를 인코딩 -> 48
//       '0' 을 인코딩 -> 97
        char ak= 'a'+1;
        System.out.printf("%d, %c  %n",(int)ak,ak);   // 98 , b
        String p="ABc";
        System.out.println(p=="ABc");
        System.out.println(p.equalsIgnoreCase("ABC"));
        System.out.println(p.equals("ABc"));
        // 3항 연산자의 활용
        letterOrNumber();
    }

    // 문자의 유니코드 파악 - 백준 알고리즘에 나온적 있음 알파벳 A - 유니코드 65임
    static void unicodeExchange(char c) {
        char[] ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
        for(int i=0;i<ch.length;i++) {
            if (c - 65 == i) {
                System.out.println(ch[i]);
            }
        }
    }
    // 3항 연산활용
    static void letterOrNumber(){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String result=(str.charAt(0)>='a' && str.charAt(0)<='z') ? "Letter" : "Number" ;
        System.out.print(result);
    }








}
