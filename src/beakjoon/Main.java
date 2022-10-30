package beakjoon;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {

            // EOF 단축키로 종료되도록
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    return;
                }
            });

            float input = 0;
            float n1 = 0, n2 = 0;
            float op = 0;

            while (true) {

                System.out.print("연산식을 입력하세요:");

                while (input != '=') {

                    input = System.in.read();

                    // System.out.println(input); input이 아스키 코드 2-> 10진수 float 50.0 으로 출력

                    if (input >= '0' && input <= '9') {
                        input -= '0';
                        System.out.format("%d 0x%x\n", (int) input, (int) (input + '0'));            // ,아스키로 되돌리고 int로 형변환하면 16진수 아스키코드 0xdd 출력
                    } else if (input == '+' || input == '-' || input == '*' || input == '/') {
                        op = input;
                        System.out.format("%c 0x%x\n", (char) input, (int) input);             // 아스키 - '0'해줬으니 그대로 input은 연산자가 출력됨
                        continue;
                    }

                    if (op == 0) {
                        n1 = n1 * 10 + input;             // input은  아스키 - '0' 해줬으니 현재 float 타입
                    } else if (input != '=') {
                        n2 = n2 * 10 + input;
                    } else {
                        System.out.format("%c 0x%x\n", (char) input, (int) input);
                    }
                }
                if (op == '+')
                    System.out.format("%f \n", (float) (n1 + n2));
                else if (op == '-')
                    System.out.format("%f \n", (float) (n1 - n2));
                else if (op == '*')
                    System.out.format("%f \n", (float) (n1 * n2));
                else if (op == '/') {
                    if (n2 == 0)
                        System.out.println("0");
                    else
                        System.out.format("%f \n", (float) (n1 / n2));
                }
                // 다시 반복되도록 초기화
                input = 0;
                n1 = 0;
                n2 = 0;
                op = 0;
            }
        }
    }
