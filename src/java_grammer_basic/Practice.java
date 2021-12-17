package java_grammer_basic;
import java.util.Scanner;

// java 자료구조 + 알고리즘 기술면접구현 + 알고리즘  chapter 1/11
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(deMorgan(false ,false));
        System.out.println(deMorgan( true,false));
        int width=sc.nextInt();
        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int triangleWidth=sc.nextInt();
        for(int k=0; k<triangleWidth;k++){
            for(int l=0;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 역순별
        for(int i=triangleWidth-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        npira(5);
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
    static void npira(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

    }




}
