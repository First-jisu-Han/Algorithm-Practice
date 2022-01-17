package algorithm_chap4;

public class Queue {
    public static void main(String[] args) {
        Queue que1=new Queue(90);
        System.out.println(que1.enQueue(1));
        System.out.println(que1.enQueue(2049234));
        System.out.println(que1.enQueue(4235));
        System.out.println(que1.enQueue(21435));
        System.out.println(que1.enQueue(143));
        System.out.println(que1.enQueue(13546));
        System.out.println(que1.enQueue(14236));
        System.out.println(que1.deQueue());
        System.out.println(que1.deQueue());
        System.out.println(que1.deQueue());
        System.out.println(que1.deQueue());
        System.out.println(que1.deQueue());
        System.out.println(que1.deQueue());
    }
    private int max;       // 큐의 옹량
    private int elements; // 큐 안의 있는값들
    private int[] que;  // 큐 배열

    public Queue(int capacity) {
        que=new int[capacity];
        max=capacity;
        elements=0;
    }
    public int deQueue(){
        if(elements==0){
            return -1;
        }
        int target=que[0];
        for(int i=0;i<=elements-1;i++){
            que[i]=que[i+1];
        }
        elements-=1;
        return target;
    }
    public int enQueue(int target){
        if(elements+1>=max){
            return -1;
        }
        que[elements++]=target;
        return target;
    }
}
