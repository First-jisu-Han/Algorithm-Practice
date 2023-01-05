package array_list;

import java.util.EmptyStackException;
// underflow 발생시 예외처리를 해주기 위해서

// 배열로 구현한 스택

public class ArrayStack<E> {
    private E s[];
    private int top;

    // 스택의 생성자
    public ArrayStack() {
        s=(E[]) new Object[1]; // 초기에 배열의 크기가 1인 공간을 생성
        top=-1;
    }

    //underflow 발생

    public E peek() {
        if (isEmpty()) {
            throw
                    new EmptyStackException();
        }
        return s[top];
    }

    public int size() {
        return top+1;
    }


    public boolean isEmpty() {
        return (top==-1);  // true or false 출력
    }


    public void push(E newItem) {

        if(size()==s.length) {
            resize(2*s.length);
        }
        s[++top]=newItem;
    }

    public E pop() {

        if(isEmpty()) {
            throw new EmptyStackException();
        }

        E item=s[top];
        s[top--]=null;

        // s 배열의 공간이 배열 전체 공간의 4분의 1 만 차지할때 , 2분의 1 크기로 줄인다.
        if (size()>0 && size()==s.length/4)
            resize(s.length/2);
        return item;
    }



    public void resize(int newSize ) {
        // newSize 크기의 새로운 배열 t 생성한
        Object[]t=new Object[newSize];

        for(int i=0;i<size();i++) {
            t[i]=s[i];
        }
        // 배열 t를 배열 s에 넣는다.
        s=(E[])t;
    }

    public void print(){
        if(isEmpty()) {
            System.out.print("스택이 비어있음");
        }
        else {
            for(int i=0;i<=top;i++) {
                System.out.print(s[i]+" ");
            }
        }
        System.out.println();
    }







}
