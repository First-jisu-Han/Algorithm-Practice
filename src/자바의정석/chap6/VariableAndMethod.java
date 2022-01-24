package 자바의정석.chap6;

// 이론적 부분
public class VariableAndMethod {
    public static void main(String[] args) {
    }
}
class Varables {
    int iv;      // 인스턴스 변수 : 인스턴스를 생성해야됨
    static int cv;   // 클래스 변수 : 클래스가 만들어질때 메모리공간에 생성
    void method(){
        int iv=0;    // 지역변수 : 필드 이외에서 선언됨 - 변수가 선언될때 메모리에 올라감
                     // 메서드 내에서만 사용가능
    }
    // show21메서드만 사용하면 21을 보여주는 메서드임을 알 수 있음
    // 안의 코드는 "블랙박스화" 라고 부를 수 있음 - 안의 코드는 몰라도됨.
    void show21 (){ // 선언부
        int k=20;    // 구현부
        k+=1;
        System.out.println("k = " + k);
    }

}

