package algorithm_chap4;

public class SharedStack {
    private int max;       // 하나의 배열의 용량
    private int pointerA;  // 스택 1의 포인터
    private int pointerB;  // 스택 2의 포인터
    private int[] stack; // 스택 1, 2 를 품는 배열

    // 실행할 때 예외：스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // 생성자
    public SharedStack(int max) {
        pointerA= 0;
        pointerB= max - 1;
        this.max=max;
        try {
            stack= new int[max]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }
    // push
    public int push(AorB choice, int newInt)throws OverflowIntStackException {
        if (pointerA >= pointerB+1){
            throw new OverflowIntStackException();
        }
            switch (choice) {
                case StackA:
                    stack[pointerA++] = newInt;
                    break;
                case StackB:
                    stack[pointerB--] = newInt;
                    break;
            }
        return newInt;
    }

    public int pop(AorB choice) throws EmptyIntStackException {
        if (pointerA < 0 || pointerB > max - 1) {
            new EmptyIntStackException();
        }
        int target = 0;
        switch (choice) {
            case StackA:
                target = stack[pointerA--];
                break;
            case StackB:
                target = stack[pointerB++];
                break;
        }
        return target;
    }



}
