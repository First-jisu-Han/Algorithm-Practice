package algorithm_chap4;
// 스택 자료구조 구현
public class Stack {
    private int max;      // 최대 용량
    private int pointer;  // 현재 높이 , 스택 포인터 설정
    private int[] stk; // 스택의 본체

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){
        }
    }


    // 스택 생성자
    public Stack(int capacity){
        pointer=0;
        max=capacity;
        try{
            stk=new int[capacity];
        } catch (OutOfMemoryError e) {  // 생성 불가
            max = 0;
        }
    }

    public int push(int newInt) throws OverflowIntStackException {
        if (pointer >= max) {throw new OverflowIntStackException();
        }
        return stk[pointer++] = newInt;
    }


    public int pop() throws EmptyIntStackException{
        if(pointer<=0){
            throw new EmptyIntStackException();
        }
        return stk[--pointer];
    }


    public int peak() throws EmptyIntStackException {
        if(pointer <=0){
            throw new EmptyIntStackException();
        }
        return stk[pointer-1];
    }


    public int indexOf(int target){
        for(int i=pointer-1;i<=0;i--){
            if(stk[i] == target) return i;
        }
        return -1;
    }

    public void clear(){
        pointer=0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return pointer;
    }
    public boolean isEmpty() {
        return pointer<=0;
    }
    public boolean isFull(){
        return pointer>=max;
    }
    public void dump(){
        if(pointer==0){
            System.out.println("배열이 비어있다");
        }
        for(int i=0;i<pointer;i++){
            System.out.print(stk[i]+ " ");
        }
        System.out.println();
    }










}
