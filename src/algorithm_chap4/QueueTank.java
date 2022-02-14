package algorithm_chap4;

public class QueueTank{
    public static void main(String[] args) {
        RingQueue rq=new RingQueue(20);
        System.out.println(rq.enqueue(20));
        System.out.println(rq.enqueue(10));
        System.out.println(rq.enqueue(100));
        System.out.println(rq.enqueue(400));

        System.out.println(rq.search(10));

        rq.dump();
        System.out.println("");
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());




    }
}

// 원형 큐 구현
class RingQueue {
    private int rear;    // 끝
    private int front;   // 시작
    private int max;    // 최대 용량
    private int[] que;  // 큐 배열
    private int currentSize; // 현재 용량

    public RingQueue(int max){
        rear=front=currentSize=0;
        this.max=max;
        try{
            que=new int[max];
        } catch(OutOfMemoryError e){
            max=0;
        }
    }

    public int enqueue(int value) {
        if(currentSize>=max){
            return 0;
        }
        que[rear++]=value;
        currentSize++;
        if(rear==max){
            rear=0;
        }
        return value;
    }
    public int dequeue(){
        if(currentSize<=0){
            return 0;
        }
        int temp=que[front++];
        currentSize--;
        if(front==max){
            front=0;
        }
        return temp;
    }

    // 모든 값 출력
    public void dump(){
        if(currentSize<=0){
            System.out.print("Nothing in Queue");
        }
        for(int i=0;i<currentSize;i++){
            System.out.printf("%d ", que[i]);
        }
    }

    // 문제: 임의의 데이터를 검색할 수 있는 메서드를 구현하라
    public String search(int value) {
        int i = 0;
        for (i = 0; i < currentSize; i++) {
            if (que[i] == value) {
                return (i+1)+"번쨰";
            }
        }
        if (i == currentSize - 1) System.out.println("Could not find value");
        return null;
    }








}

