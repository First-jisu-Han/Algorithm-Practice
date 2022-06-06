package pattern.observer;

public class EventSubscriber implements Observer {
    private String newsContents;
    private Publisher publisher;

    public EventSubscriber(Publisher publisher){
        this.publisher=publisher;
        publisher.add(this); // EventSubscriber를 리스트에 추가 - observer의 일원으로 추가
    }


    @Override
    public void update(String title, String news) {
        this.newsContents=title+"\n -----------------\n"+news+"\n";
        display();
    }
    public void display(){
        System.out.println("\n\n=======이벤트 유저========\n\n");
        System.out.println("\n\n"+newsContents+"\n\n");
    }
}
