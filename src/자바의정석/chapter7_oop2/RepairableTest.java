package 자바의정석.chapter7_oop2;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank=new Tank();
        SCV scv=new SCV();
        scv.repair(tank);
//      scv.repair(marine); 불가능하게끔
    }
}

interface Repairable{
}

class Unit{
    int hitPoint ;
    final int MAX_HP;
    Unit(int hp){
        this.MAX_HP=hp;
    }
}

class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint=MAX_HP;
    }
    public String toString(){
        return "Tank";
    }
}
class Marine extends GroundUnit {
    Marine(){
        super(120);
        hitPoint=MAX_HP;
    }
    public String toString(){
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint=MAX_HP;
    }
    void repair(Repairable r){
        if(r instanceof Repairable){
            Unit u= (Unit) r;
            while(u.hitPoint !=MAX_HP){
                u.hitPoint++ ;
            }  // HP 를 증가시킨다.
            System.out.println(u.toString()+"의 수리가 끝남");
        }

    }
}