package pattern.observer;

public class AnnualSubscriber implements Observer {
    private String newsContents;
    private Publisher publisher;


    // 생성즉시  , observer로 등록
    public AnnualSubscriber(Publisher publisher){
        this.publisher=publisher;
        publisher.add(this); // 이 객체를 추가
    }

    @Override
    public void update(String title, String news) {
        this.newsContents=title+"\n -----------------\n"+news+"\n";
        display();
    }

    public void display(){
        System.out.print("뉴스시작");
    }



}
