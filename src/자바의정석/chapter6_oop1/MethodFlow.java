package 자바의정석.chapter6_oop1;

public class MethodFlow {
    public static void main(String[] args) {
       /*   getCountry();  */  // static 에서는 인스턴스 메서드 사용불가능 - 메모리에 올라오지 않았기 때문에
    }
    private int age;
    private String name;
    private String country;


    public MethodFlow(String name, String country){
        this.name=name;
        this.country=country;
    }

    public static String projectName(){
        MethodFlow mf= new MethodFlow("한지수","Korea");
        mf.getAge();  // 생성자를 생성해야 비로소 사용가능한 부분이다 .
        return "static (클래스) vs 인스턴스 메서드";

    }
    public int getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }

    public String getInformation(String name){
        if(name=="JS"){
            return getCountry()+getAge();  // 인스턴스 메서드에서는 인스턴스메서드 사용가능
        }
        return projectName(); // static메서드는 이미 메모리에 올라가 있기에 인스턴스 메서드에서 사용가능
}
    }