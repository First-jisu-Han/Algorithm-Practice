package 자바의정석.chapter9_usefulclasses;

public class VariousClass {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(4,6);
        System.out.println(triangle.getMedi());

        System.out.println(Math.random()*10+1); // 1.0~11.0사이 랜덤값
    }
}


class Triangle{
    private double width;
    private double height;
    private double medi;

    Triangle(int width,int height){
        this.width=width;
        this.height=height;
        this.medi=Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getMedi(){
        return medi;
    }

}