package 자바의정석.chapter7_oop2;

// final 이용
public class finalUsage {
    public static void main(String[] args) {

    }
}

// final- 단하나의 값, 선언과 동시에 초기화 되어야한다.
class man {

    private final int age;
    private final String sex;

    public man(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

}

// 싱글톤으로 구현
class ItemStore{

    private ItemStore(){
    }

    public static ItemStore getInstance(){
        ItemStore itemstore=new ItemStore();
        return itemstore;
    }

}