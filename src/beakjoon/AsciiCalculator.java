package beakjoon;
import java.util.Scanner;

    public class AsciiCalculator {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            while(true) {
                String sentence=sc.nextLine();
                // 엔터만 입력시 종료 flow
                if(sentence.length()==0) break;

                String [] numAndOp=sentence.split(" ");

                int num1=Integer.parseInt(numAndOp[0]);
                int num2=Integer.parseInt(numAndOp[2]);
                String operator=numAndOp[1].trim();

                // 16진수 변환
                print(getAscii(num1));
                print(getAscii(operator.charAt(0)));
                print(getAscii(num2));


                print("---------------------");
                print("계산결과: "+getCalResult(num1,num2,operator));
                print("---------------------");
            }

        }

        // 16진수 변환
        public static String getAscii(int num) {
            String hex = Integer.toHexString(num);
            return hex;
        }


        public static void print(String st) {
            System.out.println(st);
        }

        // 계산식 결과 return
        public static int getCalResult(int num1,int num2,String op) {
            if(op.equals("+")) {
                return num1+num2;
            } else if(op.equals("-")) {
                return num1-num2;
            } else if(op.equals("/")) {
                return num1/num2;
            } else if(op.equals("*")) {
                return num1*num2;
            } else if (op.equals("%")) {
                return num1%num2;
            } else {
                return 0;
            }

        }

    }

