package 자바의정석.chapter7_oop2;

import java.util.Map;

public class Polymorphisms {
    public static void main(String[] args) {
        Consumer consumer1=new Consumer();
        Item item1=new Item(1L,"컴퓨터",3000,30);
        Item item2=new Item(2L,"마우스",5000,50);
        Item item3=new Item(3L,"키보드",3000,40);
        Item item4=new Item(4L,"커피",3000,10);

        consumer1.consumeMoney(item1);
        consumer1.consumeMoney(item2);
        consumer1.consumeMoney(item3);
        consumer1.consumeMoney(item4);
    }}
class Item{
    private int price;
    private String itemName;
    private Long id;
    private int bonus;
    public Item(Long id ,String itemName,int price,int bonus){
        this.id=id;
        this.itemName=itemName;
        this.price=price;
        this.bonus=bonus;
    }
    public Long getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public int getBonus(){
        return bonus;
    }
}

class Consumer {
    private int money = 10000;
    private int bonusPoint = 0;

    public void consumeMoney(Item item) {
        if (money < item.getPrice()) {
            System.out.println("잔액부족");
        }
        else{
            money-=item.getPrice();
            bonusPoint+=item.getBonus();
            System.out.println("구매완료");
        }
    }



}