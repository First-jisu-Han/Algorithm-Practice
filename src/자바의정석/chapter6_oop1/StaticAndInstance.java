package 자바의정석.chapter6_oop1;


public class StaticAndInstance {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    // 재귀 논리적 연습 - factorial
    static int fac(int n){
        if(n==1) return 1;
        else{
            return n*fac(n-1);
        }
    }
    // static - 클래스 멤버 , static이 없는 것은 인스턴스 멤버
    // static -> 클래스가 만들어질때 같이 메모리에 올라가서 이미 생성, static 이 없는 것은 생성자를 통해 인스턴스가 만들어져야만 인스턴스.메서드로 접근가능
    static void getTwoDiffName(String name){
        System.out.print(setName(name)+name);  //  static 으로 시점이 같기때문에 시용 가능
    }
    public static String setName(String name){
//        return name+setAnotherName(name);    //   static 메서드 안에서 인스턴스 메서드는 사용불가능- 시점 안맞기때문. 인스턴스 객체가 생성되어야만 사용가능
        StaticAndInstance si=new StaticAndInstance();
        return (name+si.setAnotherName(name));  // 인스턴스 생성을 해줘야만 이렇게 사용가능하다.
    }
    public String setAnotherName(String name){
        return name;
    }
    public void getTwoDiffNames(String name){
        System.out.print(setName(name)+name+setAnotherName(name));
        // 인스턴스 메서드 안에서 인스턴스메서드 사용가능( 인스턴스 생성시 사용가능하기때문 시점 같다 ) +static 메서드 사용가능 ( 이미 클래스가 생성될때 만들어져있기 때문 )
    }


}
