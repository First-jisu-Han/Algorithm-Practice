package 자바의정석.chapter8_exception;

import java.io.File;

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
// 예외 발생시키기
class exceptionMaking {
    public static void main(String[] args) {
            try{
                throw new Exception("고의 발생시킴");
            } catch(Exception e){
                System.out.println("에러메세지:"+e.getMessage());
                e.printStackTrace();
            }
            System.out.println("프로그램 정상 종료");
    }
}

// 예외를 메서드에 선언
class MethodException {
    public static void main(String[] args) {
        try{
            method1();
        } catch(Exception e){
            System.out.println("method 1에서 발생한 오류를 잡음 오류 메세지 : "+ e.getMessage());
            e.printStackTrace();
        }
    }
    static void method1() throws Exception {
        throw new Exception("예외 던진다.");
    }
}

class ExceptionTestFile{
    public static void main(String[] args) {

    }
    static File createFile(String fileName){
        try{
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않음");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f){
        try{
            f.createNewFile();
        } catch (Exception e){

        }
    }
}


// 오류 내려줄때
class MyException extends Exception {
    private final int ERR_CODE;

    MyException(String message, int errCode) {
        super(message);
        ERR_CODE = errCode;
    }
    MyException(String message){ // 메세지만 입력하고, 에러코드를 입력하지 않았을때
        this(message,200);
    }
    public int getErrCode(){
        return ERR_CODE;
    }
}


