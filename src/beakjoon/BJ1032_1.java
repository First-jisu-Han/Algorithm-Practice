package beakjoon;
import java.util.Scanner;

public class BJ1032_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] array = new String[N];
        if(N==1){
            String k= sc.next();
            System.out.print(k);
        }
        for(int i=0;i<N;i++) {
            array[i] = sc.next();
        }
        boolean flag=false;
        for(int j=1;j<array[0].length();j++){
            flag=false;
            for(int k=0;k<array[0].length();k++){
                if(array[j].charAt(k)!=array[j-1].charAt(k)) {
                    flag = true;
                    break;
                }
            if(flag==true)
            System.out.print("?");
            else{
                System.out.print(array[0].charAt(j));
            }
            }
        }

        }}


