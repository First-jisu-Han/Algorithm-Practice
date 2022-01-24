package 자바의정석.chap6;

// 클래스와 객체 부분 3회독 부분
// 객체 배열
public class ObjectArray {
    public static void main(String[] args) {
        Country[] cts = {new Country("Korea", 20), new Country("Japan", 30),
                new Country("USA", 40)};
        for (Country ct : cts) {
            System.out.println("객체배열 안의 Country Name:  " + ct.getName());
        }
    }
}

class Country {
    int population;
    String name;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public int getPopulation() {
        return population;
    }
    public String getName() {
        return name;
    }
}


