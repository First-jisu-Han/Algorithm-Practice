package array_list;

import java.util.NoSuchElementException;

public class ArrayQueue<E> {
        private E[] q;
        //front 는 빈 값 rear는 인덱스값 size는 크기값
        private int front, rear, size;
        public ArrayQueue() {
            q=(E[]) new Object[2]; // 초기에 크기가 2인 배열 생성
            front=rear=size=0;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty() {
            return size==0;
        }

        public void add( E newItem) {
            // 비어있는 원소가 1개인 경우,
            if ((rear+1)%q.length==front){
                resize(2*q.length);
            }
            rear=(rear+1)%q.length;

            q[rear]=newItem;
            size++;
        }
        // 큐 삭제 연산 FIFO
        public E remove() {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            front=(front+1)%q.length;
            E item=q[front];
            q[front]=null;
            size--;

            if (size>0 && size==q.length/4) {
                resize(q.length/2);}
            return item;
        }
        // q자체를 옮겨버리는 것이기 때문에 조심해야한다. 필요한 것들은 다 넣어줘야함.
        // resize 의 경우에 크기를 조절하는 것-> for 문의 출현 시간복잡도 O(n) 빅오 n 만큼의 시간이 걸림.
        public void resize(int newSize) {

            Object[] t=new Object[newSize];
            for(int i=1,j=front+1;i<size+1;i++,j++) {
                t[i]=q[j%q.length];

            }
            front=0;
            rear=size;
            q=(E[]) t; //배열 t를 배열 q로
        }
        public void print() {
            System.out.print("항목수:"+size+"/ ");
            for(int i=0;i<q.length;i++) {
                System.out.print(q[i]+" ");
            }
            System.out.println("");
        }




    }
