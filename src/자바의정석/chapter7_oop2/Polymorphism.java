package 자바의정석.chapter7_oop2;


import java.util.List;
import java.util.Map;

// 다형성 스터디
public class Polymorphism {
    public static void main(String[] args) {
        // 업캐스팅은 생략가능
        Human human=null;
        Student student=new Student(20,"studentA","seoul");
        human=student;
        human.comment();
        System.out.println(human instanceof Human);
        // 다운캐스팅은 생략 불가능


        // 참조변수의 타입으로 값이 다른 유일한 경우는 - 서로 같은 이름의 멤버변수가 있을때만 다르게 출력 , 그외 메서드는 모두 구현체의 타입으로

        Parent p1=new Child();
        Child c1=new Child();
        System.out.println(p1.x);   // 100
        System.out.println(c1.x);   // 200
        p1.method(); // c.x=200
        c1.method(); // c.x=200


        // 다형성 활용
        Buyer buyer=new Buyer();
        System.out.print(buyer.buy(new Tv())); //Product의 특정자손에 의해 Product의 price에 값이 주입이된다. // money:4800
        System.out.println(buyer.buy(new Computer()));  // 4400

    }}


class Human{
    int age;
    String name;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void comment(){
        System.out.println("Human.class");
    }
}

class Student extends Human{
    String schoolName;

    public Student(int age,String name,String schoolName){
        super(age,name);
        this.schoolName=schoolName;
    }
    public void comment(){
        System.out.println("Student.class");
    }
}

class Parent {
    int x=100;

    void method(){
        System.out.println("p.x ="+x);
    }
}

class Child extends Parent{
    int x=200;
    void method(){
        System.out.println("c.x="+x);
    }
}

class Product{
    int price;

    Product(int price){
        this.price=price;
    }
}
class Tv extends Product{

    public Tv(){
        super(200);
    }
}
class Computer extends Product{

    Computer() {
        super(400);
    }
}
class Audio extends Product{

    Audio() {
        super(500);
    }
}

class Buyer{
    int money=5000;
    public int buy(Product p){
       return money-=p.price;
    }

}