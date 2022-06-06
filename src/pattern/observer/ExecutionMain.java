package pattern.observer;

public class ExecutionMain {
    public static void main(String args[]){
        NewsMachine newsMachine=new NewsMachine();
        AnnualSubscriber annualSubscriber=new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber=new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("거리두기4단계","코로나19 거리두기 시작");
        newsMachine.setNewsInfo("거리두기 해제","거리두기 해제");

    }
}
