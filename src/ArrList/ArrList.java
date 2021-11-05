package ArrList;

import java.util.NoSuchElementException; // 리스트에 담긴 data 가 없으면 프로그램을 정지시키는 예외 클래스


public class ArrList<E> {

    private E a[];  // 리스트를 저장하는 공간
    private int size;  // 리스트의 항목 수
    public ArrList() {
        a=(E[]) new Object[1]; // 최초 원소1개 가진  배열생성  , 크기 1 저장항목 수 0 인 generic type 배열 생성
        size=0;

    }


    // CRUD - R 읽기만을 한다.
    public E peek(int k) {
        if (isEmpty()) {
            System.out.println("예외처리하겠습니다.");
            throw new NoSuchElementException();
        }
        return a[k];
    }

    // 리스트가 empty 면 true 를 리턴
    public boolean isEmpty() {
        return size==0;
    }

    //CRUD - CU .1 마지막에 데이터 삽입

    public void insertLast(E newItem) {
        // 배열에 빈공간 없다면 배열 크기 2배 확장
        if(size==a.length) {
            resize(2*a.length);
        }
        a[size++]=newItem; //
    }

    //CRUD - CU.2 중간에 데이터 삽입

    public void insert(E newItem,int k) {
        if(size==a.length) {
            resize(2*a.length);
        }
        // 맨뒤에서부터 차례로 들어갈 위치까지의 인덱스값을 뒤로밀기
        for (int i=size-1;k<=i;i--) {
            a[i+1]=a[i];
        }
        a[k]=newItem; // 삽입 1개
        size++; // 크기 1개 더 추가 증감 연산자
    }

    public void resize(int newSize) {
        Object[] t=new Object[newSize];

        for(int i=0;i<size;i++)
            t[i]=a[i];

        a= (E[]) t;
    }
    //CRUD - D 삭제

    public E delete(int k) {
        if(isEmpty())
            throw new NoSuchElementException();

        E item = a[k];

        for(int i=k;i<size;i++)
            a[i]=a[i+1];

        size--;

        if(size > 0 && size==a.length/4)
            resize(a.length/2);

        return item;
    }

    public void print() {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
    }
}
