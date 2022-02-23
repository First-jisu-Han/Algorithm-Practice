package 자바의정석.chapter9_usefulclasses;

public class AboutString {
    public static void main(String[] args) {
        // String 클래스는 immutable한 개념 , equals() 는 객체 주소 비교가 아닌 값비교로 오버라이딩 되어있음.
        String a="a";
        String b="b";
        a=a+b;  // a는 새로운 인스턴스 주소를 갖는다.

        String st1="a";
        String st2="a";
        String st3=new String("a");
        String st4=new String("a");
        // equals는 단순 값만 비교하기 때문에 모두 true일 것
        System.out.println(st1.equals(st2));
        System.out.println(st2.equals(st3));
        System.out.println(st3.equals(st4));
        // 같은 객체인지 비교
        System.out.println(st1==st2);
        System.out.println(st2==st3);
        System.out.println(st3==st4);

        String computer="cpu,mm,hdd,os,iodevice";
        String [] components=computer.split(",");
        System.out.println(computer);
        for(String component:components){
            if(component.startsWith("io")) System.out.println(component);
            else{
                System.out.printf("%s ",component);
            }
        }
        System.out.println(computer.length());
        System.out.println(components.length);
        // split과 반대되는 join
        String computer1="cpu,mm,hdd,os,iodevice";
        String [] componentss=computer.split(",");
        String completeComputer=String.join("-",componentss); // , 로 되어있는것을 -로바꿔서 String 하나로 통합
        System.out.println("completeComputer = " + completeComputer);





    }

}
