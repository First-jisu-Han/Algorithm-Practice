package 자바의정석.chapter8_exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int number = 90;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) Math.random() * 10;   // 0~9
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("나누는 수가 0이고, 0으로 나눌 수 없습니다");
                System.out.println(e.getStackTrace());
                System.out.println(e.getMessage());
            }

        }
    }
}
