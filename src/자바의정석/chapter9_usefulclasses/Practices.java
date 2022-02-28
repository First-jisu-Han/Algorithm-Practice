package 자바의정석.chapter9_usefulclasses;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input.trim(); //  양쪽 공백 없애고
        String [] arr=input.split(" +"); // +는 하나 이상의 공백
        for(String ar : arr ){
            System.out.printf("%s ",ar);
        }
        System.out.println("");
        String k=String.join(" ",arr);
        System.out.println(k+(k instanceof String));

        String source= "200,300,400,600";
        StringTokenizer st= new StringTokenizer(source,",");
        System.out.println("토큰의 개수"+st.countTokens());
        System.out.println("st.nextToken() = " + st.nextToken());


        Scanner sc1= new Scanner(System.in);
        StringTokenizer st1=new StringTokenizer(sc1.nextLine()," ");

        Scanner sc2= new Scanner(System.in);
        String [] str=sc2.nextLine().split(" ");
        for(String s:str){
            Integer.parseInt(s);
        }
        
        
    }

}
