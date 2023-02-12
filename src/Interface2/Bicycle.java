package Interface2;
import java.util.Random;

public class Bicycle implements Vehicle{
    int speed;
    int gear;

    String color;

    public Bicycle(int speed, int gear, String color){
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void changeGear(int gear) {
        Random oneToSix = new Random();
        int min = 1;
        int max = 6;
        this.gear = (int)Math.floor(Math.random() * (max - min + 1) + min); // gives random number between 1 and 6
        System.out.println("Switched to gear " + this.gear);
    }

    @Override
    public void speedUp(int km) { // øger "hastigheden" med argument int

        this.speed = this.speed + km;
        System.out.println("now at " + this.speed + "km/h");
    }

    @Override
    public void applyBrakes(int km) { // nedsætter "hastigheden" med argument int
        this.speed = this.speed - km;
        System.out.println("now at " + this.speed + "km/h");
    }
}
