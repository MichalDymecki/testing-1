import java.util.SortedMap;

public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem!");
    }

    @Override
    public String info() {
        return "rower";
    }

    public void zatankuj(){
        System.out.println("Żeby mieć dużo siły myszę zjeść obiad.");
    }
}
