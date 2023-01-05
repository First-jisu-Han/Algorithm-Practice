package array_list;
import array_list.ArrayStack;

public class MainArrayStack {
    public static void main(String[] args) {
        ArrayStack<String> stack=new ArrayStack<String>();

//		stack.peek(); // 아무것도 없기 때문에 예외처리에 걸려서 프로그램이 종료된다. 
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.print();

        System.out.println(stack.peek());
        stack.push("4");
        stack.print();

        stack.pop();
        stack.print();

        System.out.println(stack.peek());
        stack.push("5");
        stack.print();


    }

}