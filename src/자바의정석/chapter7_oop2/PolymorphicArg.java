package 자바의정석.chapter7_oop2;

import java.util.Vector;

public class PolymorphicArg {
    public static void main(String[] args) {
        Client c=new Client();
        LEDTv ledTv=new LEDTv();
        Book book=new Book();
        c.buy(book);
        c.buy(ledTv);
        c.summary();
        c.refund(ledTv);
        c.summary();
    }
}

class Client{
    private int money=10000;
    private int bonusPoint=0;

    Vector item = new Vector();   // 구매 아이템 목록

    void buy(Goods g){
        if(money<g.getprice()){
            System.out.println("한도초과");
            return;
        }
        money-=g.getprice();
        item.add(g);
    }
    void refund(Goods g){
        if(item.remove(g)){
            money+=g.getprice();
            return;
        }
        System.out.println("상품을 구매한 이력이 없음");
    }
    // 구매목록 요약
    void summary(){
        int sum=0;
        String itemList=" ";

        if(item.isEmpty()){
            System.out.println("구매목록이 비어있음");
        }
        for(int i=0;i<item.size();i++){
            Goods g=(Goods) item.get(i);
            sum+=g.getprice();
            itemList+= (i==0) ? " "+g : ", " +g ;
        }
        System.out.println("sum=" + sum);
        System.out.println("itemList = " + itemList);
    }
}

class Goods{
    private int price;
    private int bonusPoint;

    public Goods(int price){
        this.price=price;
    }
    public Goods(){
        price=0;
        bonusPoint=0;
    }
    public int getprice(){
        return price;
    }
}

class LEDTv extends Goods{
    public LEDTv(){
        super(2000);
    }
}

class Book extends Goods{
    public Book(){
        super(1000);
    }
}

