package kotlin

class practice {
    var a: Int = 10; // int a 느낌
    val b: Int = 10; // static final int b 같은 느낌 , 상수

    var st = "string";  // 변수타입 자동추론 - String
    val num = 10;   // 변수 타입 자동 추론  - int
// 코틀린은 변수를 선언하면서 초기화까지 바로한다고 생각

    var somthing: Any = "Hi";  // Any타입 - Object 타입이라고 생각하면 됨

    var score: Int = 20;
    fun main() {
        when (score) {
            100 -> println('S')
            in 90..99 -> println('A')
            in 80..89 -> println('B')
            else -> println('C');
        }
    }
// kotlin oop
}
class Car(color:String,speed:Int){
    var color:String;
    var speed:Int;
    init{
        this.color=color
        this.speed=speed
    }
    fun upSpeed(value:Int){
        if(speed+value>=200){
            speed=200
        } else {speed+=value}
    }
    fun downSpeed(value:Int){
        if(speed-value<=0){
            speed=0
        } else{ speed-=value}
    }
    fun main(){
        var car1=Car("red",10)
        var car2=Car("blue",30)
        println(car1.speed)
    }
}

// Kotlin 에서의 상속 open
open class Automobile(color: String, speed: Int) {
    var color: String;
    var speed: Int;

    init {
        this.color = color
        this.speed = speed
    }

    open fun upSpeed(value: Int) {
        if (speed + value >= 200) {
            speed = 200
        } else {
            speed += value
        }
    }

    fun downSpeed(value: Int) {
        if (speed - value <= 0) {
            speed = 0
        } else {
            speed -= value
        }
    }

    class BMW(color: String, speed: Int) : Automobile(color, speed) {
        var seatNum: Int = 0

        constructor(color: String, speed: Int, seatNum: Int) : this(color, speed) {
            this.seatNum = seatNum
        }

        override fun upSpeed(value: Int) {
            speed = if (speed + value >= 250) 250 else speed + value
        }

        var automobile1 = BMW("red", 10, 4)
        var automobile2 = BMW("red", 10)

        println(automobile2.seatNum)

    }}


