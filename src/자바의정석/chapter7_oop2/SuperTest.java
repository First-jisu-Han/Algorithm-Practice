package 자바의정석.chapter7_oop2;

// super에 대한 학습
public class SuperTest {
    public static void main(String[] args) {

    }
}
class Point{
    int x=10;
    int y=20;

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}

// 상속관계에서는 자식의 클래스의 생성자의 첫줄은 무조건 부모의 생성자를 호출하게된다.
class Point3D extends Point {
    int z=30;

    Point3D(){
        this(100,200,300);
    }

    Point3D(int x,int y,int z){
//        super();  가 무조건 들어가게된다. 하지만 부모는 기본생성자는 없다. 따라서 아래와 같이 초기화한다.
        super(x,y);   // 조상클래스의 맴버변수는 조상의 생성자에 의해 초기화되도록 한다.
        this.z=z;
    }
}