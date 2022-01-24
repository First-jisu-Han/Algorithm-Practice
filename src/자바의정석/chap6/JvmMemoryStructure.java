package 자바의정석.chap6;

public class JvmMemoryStructure {
    public static void main(String[] args) {
        System.out.println("main이 실행됨");
        firstMethod();
        System.out.print("main이 끝남 ");
    }
    public static void firstMethod(){
        System.out.println("fistMethod() 시작");
        secondMethod();
        System.out.println("fistMethod() 끝남");

    }
    public static void secondMethod(){
        System.out.println("secondMethod() 시작");
        System.out.println("secondMethod");
        System.out.println("secondMethod() 끝");
    }
}

// JVM - 메서드 영역( 클래스에 대한 정보 저장,클래스변수도 함께 생성) / 호출 스택(메서드작업에 필요한 메모리공간 제공) / 힙 영역(인스턴스가 생성되는 공간)

/*
JVM 의 call stack ( 호출 스택 ) 에서 JvmMemoryStructure 클래스를 실행하면
호출스택의 구조

println        ㅣ
secondMethod() ㅣ      구조  -> 위에서 부터 하나씩 처리하고 , 처리되면 호출스택에서 내보낸다.
firstMethod()  ㅣ
main           ㅣ
----------------
 */


// 참조형 타입으로 매개변수를 설정하면, 참조형 자체값을 바꿀 수 있다.
class ReferenceParam{
    public static void main(String[] args) {
        int[] x= {10};
        System.out.println("x[0] = " + x[0]);
        change(x);
        System.out.println("x[0] = " + x[0]);
    }
    public static int change(int[] x ){
        return x[0]=100;
    }
}
// 기본형으로 매개변수를 설정하면 , 참조값은 바뀌지않는다.
class PrimitiveParam{
    public static void main(String[] args) {
        Tester tester=new Tester();
        System.out.println("x = " + tester.x);
        change(tester.x);
        System.out.println("x = " + tester.x);
    }
    public static int change(int x ){
        return x=100;
    }
}
class Tester{
    int x=10;
}
