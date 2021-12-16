package java_grammer_basic;
public class Practice {
    public static void main(String[] args) {
        System.out.println(deMorgan(false ,false));
        System.out.print(deMorgan( true,false));

    }
//    De Morgan's laws  - 드 모르강의 법칙 ,간단한 집합 법칙 !와 조건 혼합시 알아둬야할 부분
    static boolean deMorgan(boolean a, boolean b){
        if(!(a==true || b==true)){
            System.out.println("if(a==false && a==false) 와 같다 ==> 조건안에 들어왔다. 각 조건을 부정하고 논리합을 논리곱으로 논리 곱을 논리합을로 바꾼다 ");
        }
        else if(!(a==false && b==false)) {
            System.out.println("if(a==true || b==true) 와 같다 ==> 조건안에 들어왔다. 각 조건을 부정하고 논리합을 논리곱으로 논리 곱을 논리합을로 바꾼다 ");
        }
        return a;
    }

}
