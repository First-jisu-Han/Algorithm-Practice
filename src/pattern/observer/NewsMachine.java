package pattern.observer;

import java.util.ArrayList;

public class NewsMachine implements Publisher {
    private ArrayList<Observer> observers=new ArrayList<>();  // 다수의 옵저버 가짐
    private String title;
    private String news;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int index=observers.indexOf(observer);  // 해당 옵저버 index 찾고
        observers.remove(index);   //  옵저버 삭제
    }

    @Override
    public void notifyToObserver() {
        for(Observer observer : observers){
            observer.update(title,news);
        }   // 모든 옵저버들에게 해당사항 업데이트
    }
    // 뉴스의 내용 세팅.
    public void setNewsInfo(String title, String news){
        this.title=title;
        this.news=news;
        notifyToObserver();  // setter를 통해 title, news를 세팅한 내용 update
    }
    public String getTitle(){
        return title;
    }
    public String getNews(){
        return news;
    }

}
