package 자바의정석.programmingpractice.chap1to3;

/* 자바의 정석 복습 1page- 132page - 0627 chapter1,chapter2,chapter3 */

public class JavaReview {
    public static void main(String args[]) {
        String url = "www.naver.com";
        int num = 5000000;
        System.out.printf("num=[%10d]=", num); // 앞쪽 비워
        System.out.printf("num=[%-10d]=", num); // 뒤쪽 비워
        System.out.printf("url=[%20s]=", url);  // 앞쪽 비워
        System.out.printf("url=[%-20s]=%n", url); // 뒤쪽 비워
        char unicodeDefault = 'A'; // unicode- A는 65
        char blackboxUnicode = 'A' + 2; // C
        System.out.println("A에2를 더하면 C 가된다 unicodeDefault+2=blackboxUnicode=" + blackboxUnicode);
        System.out.println("---------------------------------------------------------");
        float f= 9.1234567f;
        double d=9.123456;
        double df=f;  // 캐스팅 (형변환)
        float fd=(float)d; // 캐스팅 (형변환)
        /**
         * 실수 연산은 나눈값 반환
         * 정수 연산은 몫 반환
         **/
        double num1=10;
        int num2=3;
        int num3=10;
        System.out.println(num1/num2);
        System.out.println(num3/num2);
        // equals() , ==  : 객체 주소까지 완전 비교 == , 내용이 같은지 equals()
        String testSt=new String("String");
        String simpleSt="String";
        System.out.println(simpleSt==testSt);  // false
        System.out.println(simpleSt.equals(testSt));  // true
        // && 가 || 보다 우선순위 높음
        // ? :
        int result=num2<num3 ? num2: num3;
        System.out.println("result = " + result);

    }

}
