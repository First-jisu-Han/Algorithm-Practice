package 자바의정석.chapter9_usefulclasses;

public class UsefulClass {
    public static void main(String[] args) {
        // StringBuffer 클래스는 mutable한 클래스
        StringBuffer sb=new StringBuffer("stringBuffer");  // 문자열 내용 설정 
//        StringBuffer sb=new StringBuffer(29);  - 버퍼의 길이 설정. 

        sb.capacity(); // 버퍼의 용량
        sb.delete(0,6); // 0번째 인덱스부터 5 인덱스까지 문자 삭제
        System.out.println("sb = " + sb);   // Buffer
        sb.deleteCharAt(0); // 지정된 인덱스번째 문자 삭제
        System.out.println("sb = " + sb);    // uffer

        sb.reverse(); // 문자열을 거꾸로
        System.out.println("sb = " + sb);   // reffu

        StringBuffer sb2=sb.append("12");
        System.out.println("sb= "+sb);
        System.out.println(sb==sb2);

/*
        StringBuilder - StringBuffer는 멀티쓰레드에 안전하도록 동기화되어있다. 멀티쓰레드 환경의 동기화가 
        StringBuffer의 성능을 떨어뜨릴 수 있기때문에 멀티쓰레드가 아닌 싱글쓰레드인 경우,StringBuffer에서 쓰레드 동기화만 뺀 StringBuilder를 사용한다. 
        이름만 다르고 완전히 기능이 똑같다. 
        
 */
        
        StringBuilder stringBuilder=new StringBuilder("StringBuilder");
        stringBuilder.append(123); 
        stringBuilder.delete(13,16);
        stringBuilder.delete(0,5);
        stringBuilder.deleteCharAt(0);
        System.out.println("stringBuilder = " + stringBuilder);
        
    }
}
