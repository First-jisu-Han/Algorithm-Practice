package 자바의정석.chapter7_oop2;


public class Oops {
    public static void main(String[] args) {
        Desk desk=new Desk(new Shape(2,3),200 ,"newJS");
        System.out.println(desk.getName());
        System.out.println(desk.getPrice());
        Desk savedDesk=new Desk();
        System.out.println(savedDesk.getName());
        System.out.println(savedDesk.getPrice());
        System.out.println(savedDesk.getClassified());
    }

}


class TreeFurniture{
    String config="목재";
    String classified="가구";

}

// 모양 클래스-가로 세로 길이
class Shape{
   private int x;
   private int y;
   public Shape(int x, int y){
       this.x=x;
       this.y=y;
   }
}

class Desk extends TreeFurniture{
    private Shape shape;
    private int price;
    private String name;

    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String getClassified(){
        return classified;
    }


    Desk(Shape shape,int price ,String name){
        this.price=price;
        this.name=name;
        this.shape=shape;
    }
    Desk(){
        this(new Shape(20,50),500,"JS");
    }
}



